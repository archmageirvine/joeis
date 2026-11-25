package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Abelian unipotent subgroup census for binary general linear groups.
 * @author Gregory Morse
 */
final class BinaryAbelianUnipotent {

  private final Map<Integer, Z> mCounts = new HashMap<>();
  private final Map<Integer, List<int[]>> mSubspaces = new HashMap<>();

  private static void subspaces(final int pivots, final int left, final int[] basis, final int index, final List<int[]> out) {
    if (left == 0) {
      out.add(basis.clone());
      return;
    }
    final int bit = Integer.lowestOneBit(left);
    final int free = (bit - 1) & ~pivots;
    for (int x = free; ; x = (x - 1) & free) {
      basis[index] = bit | x;
      subspaces(pivots, left ^ bit, basis, index + 1, out);
      if (x == 0) {
        break;
      }
    }
  }

  List<int[]> subspaces(final int n) {
    return mSubspaces.computeIfAbsent(n, k -> {
      final List<int[]> out = new ArrayList<>();
      for (int p = 0; p < (1 << n); ++p) {
        subspaces(p, p, new int[Integer.bitCount(p)], 0, out);
      }
      out.sort(Comparator.comparingInt(a -> a.length));
      return out;
    });
  }

  static Z subspaceCount(final int n) {
    Z total = Z.ZERO;
    for (int d = 0; d <= n; ++d) {
      total = total.add(Binomial.gaussianBinomial(n, d, 2));
    }
    return total;
  }

  private static int[] elements(final int[] basis) {
    final int[] out = new int[1 << basis.length];
    for (int x = 1; x < out.length; ++x) {
      out[x] = out[x & (x - 1)] ^ basis[Integer.numberOfTrailingZeros(x)];
    }
    return out;
  }

  private static int pivot(final long x) {
    return Long.SIZE - 1 - Long.numberOfLeadingZeros(x);
  }

  private static int insert(final long[] basis, long x) {
    while (x != 0) {
      final int p = pivot(x);
      if (basis[p] == 0) {
        basis[p] = x;
        return 1;
      }
      x ^= basis[p];
    }
    return 0;
  }

  private static long reduce(final long[] basis, long x) {
    for (int p = basis.length - 1; p >= 0; --p) {
      if (((x >>> p) & 1) != 0) {
        x ^= basis[p];
      }
    }
    return x;
  }

  private final class Sylow {
    private final int mDimension;
    private final short[][] mProduct;
    private final int[][] mAction;
    private final boolean[][] mInvariant;
    private final int[][] mLower;
    private final int mFlags;

    private Sylow(final int n) {
      mDimension = n;
      final int cells = n * (n - 1) / 2;
      final int size = 1 << cells;
      final int[] row = new int[cells];
      final int[] col = new int[cells];
      for (int k = 0, d = n - 1; d > 0; --d) {
        for (int j = 0; j < n - d; ++j) {
          row[k] = j;
          col[k++] = j + d;
        }
      }
      mAction = new int[size][1 << n];
      for (int x = 0; x < size; ++x) {
        for (int j = 0; j < n; ++j) {
          mAction[x][1 << j] = 1 << j;
        }
        for (int t = x; t != 0; t &= t - 1) {
          final int k = Integer.numberOfTrailingZeros(t);
          mAction[x][1 << row[k]] ^= 1 << col[k];
        }
        for (int v = 1; v < (1 << n); ++v) {
          if ((v & (v - 1)) != 0) {
            mAction[x][v] = mAction[x][v & (v - 1)] ^ mAction[x][Integer.lowestOneBit(v)];
          }
        }
      }
      mProduct = new short[size][size];
      for (int x = 0; x < size; ++x) {
        for (int y = 0; y < size; ++y) {
          int z = 0;
          for (int j = 0; j < cells; ++j) {
            z |= ((mAction[y][mAction[x][1 << row[j]]] >>> col[j]) & 1) << j;
          }
          mProduct[x][y] = (short) z;
        }
      }
      final List<int[]> bases = subspaces(n);
      final long[] contained = new long[bases.size()];
      for (int j = 0; j < contained.length; ++j) {
        for (final int x : elements(bases.get(j))) {
          contained[j] |= 1L << x;
        }
      }
      mLower = new int[bases.size()][];
      mInvariant = new boolean[size][bases.size()];
      final int[] lower = new int[bases.size()];
      for (int j = 0; j < bases.size(); ++j) {
        final int[] b = bases.get(j);
        int len = 0;
        for (int i = 0; i < j; ++i) {
          if (bases.get(i).length + 1 == b.length && (contained[j] & contained[i]) == contained[i]) {
            lower[len++] = i;
          }
        }
        mLower[j] = Arrays.copyOf(lower, len);
        for (int x = 0; x < size; ++x) {
          boolean valid = true;
          for (final int v : b) {
            if ((contained[j] & (1L << mAction[x][v])) == 0) {
              valid = false;
              break;
            }
          }
          mInvariant[x][j] = valid;
        }
      }
      mFlags = fixedFlags(new int[0]);
    }

    private int fixedFlags(final int[] generators) {
      final int[] f = new int[mLower.length];
      f[0] = 1;
      for (int j = 1; j < f.length; ++j) {
        boolean valid = true;
        for (final int g : generators) {
          if (!mInvariant[g][j]) {
            valid = false;
            break;
          }
        }
        if (valid) {
          for (final int i : mLower[j]) {
            f[j] += f[i];
          }
        }
      }
      return f[f.length - 1];
    }

    private boolean fixes(final int[] generators, final int v) {
      for (final int g : generators) {
        if (mAction[g][v] != v) {
          return false;
        }
      }
      return true;
    }

    private int[] fixedPivots(final int[] generators) {
      final long[] basis = new long[mDimension];
      for (int v = 1; v < (1 << mDimension); ++v) {
        if (fixes(generators, v)) {
          insert(basis, v);
        }
      }
      final int[] pivots = new int[mDimension];
      int len = 0;
      for (int j = 0; j < basis.length; ++j) {
        if (basis[j] != 0) {
          pivots[len++] = j;
        }
      }
      return Arrays.copyOf(pivots, len);
    }

    private int relation(final int[] elements, final int value) {
      for (int k = 0; k < elements.length; ++k) {
        if (elements[k] == value) {
          return k;
        }
      }
      throw new IllegalStateException("Missing Sylow power relation");
    }

    private long[] powers(final int[] g, final int[] es, final int[] pivots, final long[] constraints) {
      final int m = mDimension;
      final int f = pivots.length;
      final long[] powers = new long[g.length * f];
      for (int i = 0; i < g.length; ++i) {
        final int word = relation(es, mProduct[g[i]][g[i]]);
        final int[] action = new int[i];
        int suffix = 0;
        for (int j = i - 1; j >= 0; --j) {
          if ((word & (1 << j)) != 0) {
            action[j] = suffix;
            suffix = mProduct[g[j]][suffix];
          }
        }
        for (int k = 0; k < f; ++k) {
          long row = 0;
          for (int h = 0; h < m; ++h) {
            final int v = 1 << h;
            if ((((mAction[g[i]][v] ^ v) >>> pivots[k]) & 1) != 0) {
              row ^= 1L << (i * m + h);
            }
            for (int w = word; w != 0; w &= w - 1) {
              final int j = Integer.numberOfTrailingZeros(w);
              if (((mAction[action[j]][v] >>> pivots[k]) & 1) != 0) {
                row ^= 1L << (j * m + h);
              }
            }
          }
          powers[i * f + k] = reduce(constraints, row);
        }
      }
      return powers;
    }

    private Z lifts(final int[] g, final int[] elements, final int d) {
      final int m = mDimension;
      final int r = g.length;
      if (r == 0) {
        return subspaceCount(d * m);
      }
      final int width = r * m;
      final long[] constraints = new long[width];
      int rank = 0;
      // The lifts must commute, not merely commute modulo their chosen
      // kernel U. Each row of the lifts satisfies the same equations.
      for (int i = 0; i < r; ++i) {
        for (int j = i + 1; j < r; ++j) {
          for (int k = 0; k < m; ++k) {
            long bits = 0;
            for (int h = 0; h < m; ++h) {
              final int v = 1 << h;
              if ((((mAction[g[j]][v] ^ v) >>> k) & 1) != 0) {
                bits ^= 1L << (i * m + h);
              }
              if ((((mAction[g[i]][v] ^ v) >>> k) & 1) != 0) {
                bits ^= 1L << (j * m + h);
              }
            }
            rank += insert(constraints, bits);
          }
        }
      }
      final int[] pivots = fixedPivots(g);
      final int f = pivots.length;
      final long[] powers = powers(g, elements, pivots, constraints);
      final long[] extra = new long[d * width];
      Z total = Z.ZERO;
      // U lies in the fixed part of the vector kernel; enumerate its
      // annihilator. Relations must take values in U. After imposing
      // these conditions, divide out the |U| choices of each lift.
      for (final int[] annihilator : subspaces(d * f)) {
        Arrays.fill(extra, 0);
        int added = 0;
        for (final int a : annihilator) {
          for (int i = 0; i < r; ++i) {
            long equation = 0;
            for (int x = a; x != 0; x &= x - 1) {
              final int h = Integer.numberOfTrailingZeros(x);
              equation ^= powers[i * f + h % f] << ((h / f) * width);
            }
            added += insert(extra, equation);
          }
        }
        final int free = d * (width - rank) - added - r * (d * f - annihilator.length);
        if (free < 0) {
          throw new IllegalStateException("Negative lift dimension");
        }
        total = total.add(Z.ONE.shiftLeft(free));
      }
      return total;
    }

    private Z countLifts(final int d) {
      final Map<Integer, Z> sums = new HashMap<>();
      AbelianSylowSubgroups.visit(mProduct, (g, elements) -> sums.merge(fixedFlags(g), lifts(g, elements, d), Z::add));
      Q total = Q.ZERO;
      // Complete flags index Sylow subgroups. Weight the local census
      // by the reciprocal of the number of flags fixed by each subgroup.
      for (final Map.Entry<Integer, Z> s : sums.entrySet()) {
        total = total.add(new Q(s.getValue().multiply(mFlags), s.getKey()));
      }
      return total.toZ();
    }
  }

  private Z compute(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    Z answer = Z.ZERO;
    for (int d = 1; d <= n; ++d) {
      // Every unipotent group has a common fixed vector. Subspace-lattice
      // Möbius inversion on the common fixed space counts it once.
      final Z value = new Sylow(n - d).countLifts(d).multiply(Binomial.gaussianBinomial(n, d, 2))
        .shiftLeft(d * (d - 1) / 2);
      answer = (d & 1) == 1 ? answer.add(value) : answer.subtract(value);
    }
    return answer;
  }

  Z count(final int n) {
    return mCounts.computeIfAbsent(n, this::compute);
  }
}
