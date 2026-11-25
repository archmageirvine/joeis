package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;

/**
 * Similarity classes of four-by-four matrices over residue rings.
 * @author Gregory Morse
 */
public final class Gl4ResidueClasses {

  private static final int DIM = 4;
  private static final int ENTRIES = DIM * DIM;

  private Gl4ResidueClasses() { }

  private static int mod(final long x, final int m) {
    return Math.floorMod(x, m);
  }

  private static int unitInverse(final int a, final int m) {
    return a == 1 ? 1 : Z.valueOf(a).modInverse(Z.valueOf(m)).intValueExact();
  }

  private static int[] identity() {
    final int[] a = new int[ENTRIES];
    for (int i = 0; i < DIM; ++i) {
      a[i * (DIM + 1)] = 1;
    }
    return a;
  }

  private static int[] multiply(final int[] a, final int[] b, final int m) {
    final int[] c = new int[ENTRIES];
    for (int i = 0; i < DIM; ++i) {
      for (int j = 0; j < DIM; ++j) {
        long value = 0;
        for (int k = 0; k < DIM; ++k) {
          value += (long) a[i * DIM + k] * b[k * DIM + j] % m;
        }
        c[i * DIM + j] = mod(value, m);
      }
    }
    return c;
  }

  private static int[] inverse(final int[] a, final int p, final int modulus) {
    final int[] first = a.clone();
    final int[] second = identity();
    for (int i = 0; i < DIM; ++i) {
      int j = i;
      while (j < DIM && first[j * DIM + i] % p == 0) {
        ++j;
      }
      if (j == DIM) {
        return null;
      }
      final int inverse = unitInverse(first[j * DIM + i] % modulus, modulus);
      for (int c = 0; c < DIM; ++c) {
        final int t = mod((long) inverse * first[j * DIM + c], modulus);
        final int u = mod((long) inverse * second[j * DIM + c], modulus);
        first[j * DIM + c] = first[i * DIM + c];
        second[j * DIM + c] = second[i * DIM + c];
        first[i * DIM + c] = t;
        second[i * DIM + c] = u;
      }
      for (int r = 0; r < DIM; ++r) {
        if (r != i) {
          final int factor = first[r * DIM + i];
          for (int c = 0; c < DIM; ++c) {
            first[r * DIM + c] = mod(first[r * DIM + c] - (long) factor * first[i * DIM + c], modulus);
            second[r * DIM + c] = mod(second[r * DIM + c] - (long) factor * second[i * DIM + c], modulus);
          }
        }
      }
    }
    return second;
  }

  private static int[][] commutator(final int[] a, final int m) {
    final int[][] equations = new int[ENTRIES][ENTRIES];
    for (int k = 0; k < ENTRIES; ++k) {
      final int[] e = new int[ENTRIES];
      e[k] = 1;
      final int[] x = multiply(e, a, m);
      final int[] y = multiply(a, e, m);
      for (int i = 0; i < ENTRIES; ++i) {
        equations[i][k] = mod(x[i] - y[i], m);
      }
    }
    return equations;
  }

  private static int divisor(int x, final int p, final int modulus) {
    if (x == 0) {
      return modulus;
    }
    int d = 1;
    while (x % p == 0) {
      d *= p;
      x /= p;
    }
    return d;
  }

  private static final class Centralizer {
    private final int[][] mBasis = new int[ENTRIES][ENTRIES];
    private final int[] mPeriods = new int[ENTRIES];

    private Centralizer(final int[] a, final int p, final int modulus) {
      final int[][] matrix = commutator(a, modulus);
      for (int k = 0; k < ENTRIES; ++k) {
        mBasis[k][k] = 1;
      }
      Arrays.fill(mPeriods, 1);
      // Diagonalize the linear commutator over Z/p^eZ. Keep the column
      // change of basis; the pivot p^v forces that coordinate to be a
      // multiple of p^(e-v).
      for (int k = 0; k < ENTRIES; ++k) {
        int least = modulus;
        int row = k;
        int col = k;
        for (int i = k; i < ENTRIES; ++i) {
          for (int j = k; j < ENTRIES; ++j) {
            final int d = divisor(matrix[i][j], p, modulus);
            if (d < least) {
              least = d;
              row = i;
              col = j;
            }
          }
        }
        if (least == modulus) {
          break;
        }
        mPeriods[k] = modulus / least;
        final int[] x = matrix[k];
        matrix[k] = matrix[row];
        matrix[row] = x;
        for (final int[] r : matrix) {
          final int t = r[k];
          r[k] = r[col];
          r[col] = t;
        }
        final int[] b = mBasis[k];
        mBasis[k] = mBasis[col];
        mBasis[col] = b;
        final int inv = unitInverse(matrix[k][k] / least, modulus);
        for (int j = k; j < ENTRIES; ++j) {
          matrix[k][j] = mod((long) matrix[k][j] * inv, modulus);
        }
        for (int i = k + 1; i < ENTRIES; ++i) {
          final int t = matrix[i][k] / least;
          for (int j = k; j < ENTRIES; ++j) {
            matrix[i][j] = mod(matrix[i][j] - (long) t * matrix[k][j], modulus);
          }
        }
        for (int j = k + 1; j < ENTRIES; ++j) {
          final int t = matrix[k][j] / least;
          matrix[k][j] = 0;
          if (t != 0) {
            for (int i = 0; i < ENTRIES; ++i) {
              mBasis[j][i] = mod(mBasis[j][i] - (long) t * mBasis[k][i], modulus);
            }
          }
        }
      }
    }
  }

  private static final class Shadow {
    private final int mP;
    private final int mModulus;
    private final Centralizer mCentralizer;
    private final Set<String> mSeen = new HashSet<>();
    private final List<int[]> mFieldGenerators = new ArrayList<>();
    private final List<int[]> mLifts = new ArrayList<>();

    private Shadow(final int p, final int modulus, final Centralizer centralizer) {
      mP = p;
      mModulus = modulus;
      mCentralizer = centralizer;
      mSeen.add(Arrays.toString(identity()));
      enumerate(0, new int[ENTRIES]);
      // Add generators in each successive layer of the kernel of reduction.
      for (int power = p; power < modulus; power = Math.multiplyExact(power, p)) {
        for (int i = 0; i < ENTRIES; ++i) {
          if (power % centralizer.mPeriods[i] == 0) {
            final int[] a = identity();
            for (int j = 0; j < ENTRIES; ++j) {
              a[j] = mod(a[j] + (long) power * centralizer.mBasis[i][j], modulus);
            }
            mLifts.add(a);
          }
        }
      }
    }

    private void enumerate(final int pos, final int[] a) {
      if (pos == ENTRIES) {
        final int[] f = a.clone();
        for (int j = 0; j < ENTRIES; ++j) {
          f[j] %= mP;
        }
        if (!mSeen.contains(Arrays.toString(f)) && inverse(f, mP, mP) != null) {
          mFieldGenerators.add(f);
          mLifts.add(a.clone());
          mSeen.clear();
          final List<int[]> queue = new ArrayList<>();
          queue.add(identity());
          mSeen.add(Arrays.toString(queue.get(0)));
          for (int k = 0; k < queue.size(); ++k) {
            for (final int[] g : mFieldGenerators) {
              final int[] t = multiply(g, queue.get(k), mP);
              if (mSeen.add(Arrays.toString(t))) {
                queue.add(t);
              }
            }
          }
        }
      } else if (mCentralizer.mPeriods[pos] == 1) {
        final int[] value = a.clone();
        for (int k = 0; k < mP; ++k) {
          enumerate(pos + 1, value);
          for (int j = 0; j < ENTRIES; ++j) {
            value[j] = mod(value[j] + (long) mCentralizer.mBasis[pos][j], mModulus);
          }
        }
      } else {
        enumerate(pos + 1, a);
      }
    }
  }

  private static final class Quotient {
    private final int mP;
    private final int[][] mImage = new int[ENTRIES][];
    private final int[] mFree;
    private final int mSize;

    private Quotient(final int[] a, final int p) {
      mP = p;
      final int[][] equations = commutator(a, p);
      for (int j = 0; j < ENTRIES; ++j) {
        final int[] v = new int[ENTRIES];
        for (int i = 0; i < ENTRIES; ++i) {
          v[i] = equations[i][j];
        }
        reduce(v);
        for (int i = 0; i < ENTRIES; ++i) {
          if (v[i] != 0) {
            final int inv = unitInverse(v[i], p);
            for (int k = i; k < ENTRIES; ++k) {
              v[k] = mod((long) v[k] * inv, p);
            }
            mImage[i] = v;
            break;
          }
        }
      }
      final int[] free = new int[ENTRIES];
      int k = 0;
      int size = 1;
      for (int j = 0; j < ENTRIES; ++j) {
        if (mImage[j] == null) {
          free[k++] = j;
          size = Math.multiplyExact(size, p);
        }
      }
      mFree = Arrays.copyOf(free, k);
      mSize = size;
    }

    private void reduce(final int[] v) {
      for (int i = 0; i < ENTRIES; ++i) {
        final int[] b = mImage[i];
        final int t = v[i];
        if (b != null && t != 0) {
          for (int j = i; j < ENTRIES; ++j) {
            v[j] = mod(v[j] - (long) t * b[j], mP);
          }
        }
      }
    }

    private int[] coordinates(final int[] v) {
      reduce(v);
      final int[] result = new int[mFree.length];
      for (int i = 0; i < mFree.length; ++i) {
        result[i] = v[mFree[i]];
      }
      return result;
    }

    private int[][] action(final int[] a, final int[] g, final int modulus, final int next) {
      final int[] inv = inverse(g, mP, next);
      if (inv == null) {
        throw new IllegalStateException("Noninvertible centralizer lift");
      }
      final int[] t = multiply(multiply(g, a, next), inv, next);
      for (int i = 0; i < ENTRIES; ++i) {
        final int v = t[i] - a[i];
        if (v % modulus != 0) {
          throw new IllegalStateException("Centralizer lift does not commute modulo the old modulus");
        }
        t[i] = mod(v / modulus, mP);
      }
      final int[][] action = new int[mFree.length + 1][];
      action[0] = coordinates(t);
      for (int k = 0; k < mFree.length; ++k) {
        final int[] unit = new int[ENTRIES];
        unit[mFree[k]] = 1;
        action[k + 1] = coordinates(multiply(multiply(g, unit, mP), inv, mP));
      }
      return action;
    }

    private int apply(int code, final int[][] action, final int[] coordinates) {
      System.arraycopy(action[0], 0, coordinates, 0, mFree.length);
      for (int j = 0; code != 0; ++j) {
        final int coefficient = code % mP;
        if (coefficient != 0) {
          for (int i = 0; i < coordinates.length; ++i) {
            coordinates[i] = mod(coordinates[i] + (long) coefficient * action[j + 1][i], mP);
          }
        }
        code /= mP;
      }
      int result = 0;
      for (int i = coordinates.length - 1; i >= 0; --i) {
        result = result * mP + coordinates[i];
      }
      return result;
    }

    private int[] lift(final int[] a, final int modulus, int code) {
      final int[] result = a.clone();
      for (int j = 0; code != 0; ++j) {
        result[mFree[j]] += modulus * (code % mP);
        code /= mP;
      }
      return result;
    }
  }

  private static Z liftCount(final int[] a, final int p, final int modulus, final int remaining) {
    if (remaining == 0) {
      return Z.ONE;
    }
    final int next = Math.multiplyExact(modulus, p);
    final Quotient quotient = new Quotient(a, p);
    final Shadow shadow = new Shadow(p, modulus, new Centralizer(a, p, modulus));
    final List<int[][]> actions = new ArrayList<>();
    for (final int[] g : shadow.mLifts) {
      actions.add(quotient.action(a, g, modulus, next));
    }
    // Kernel conjugation by 1 + modulus*X translates lifts by [X,A].
    // The remaining action of the old centralizer on that quotient is affine.
    final boolean[] seen = new boolean[quotient.mSize];
    final int[] queue = new int[quotient.mSize];
    final int[] coordinates = new int[quotient.mFree.length];
    Z total = Z.ZERO;
    for (int x = 0; x < seen.length; ++x) {
      if (!seen[x]) {
        seen[x] = true;
        queue[0] = x;
        int end = 1;
        for (int k = 0; k < end; ++k) {
          for (final int[][] action : actions) {
            final int y = quotient.apply(queue[k], action, coordinates);
            if (!seen[y]) {
              seen[y] = true;
              queue[end++] = y;
            }
          }
        }
        total = total.add(remaining == 1 ? Z.ONE : liftCount(quotient.lift(a, modulus, x), p, next, remaining - 1));
      }
    }
    return total;
  }

  private static boolean scalar(final int[] matrix) {
    for (int i = 0; i < ENTRIES; ++i) {
      if (matrix[i] != (i % (DIM + 1) == 0 ? matrix[0] : 0)) {
        return false;
      }
    }
    return true;
  }

  private static Z invariantFactors(final int p, final int e, final boolean invertible,
                                   final int[] degrees, final int index, final int offset,
                                   final int[] previous, final int[] matrix) {
    if (index == degrees.length) {
      return scalar(matrix) ? Z.ZERO : liftCount(matrix, p, p, e - 1);
    }
    final int degree = degrees[degrees.length - index - 1];
    final int diff = degree - previous.length + 1;
    int count = 1;
    for (int k = 0; k < diff; ++k) {
      count = Math.multiplyExact(count, p);
    }
    Z sum = Z.ZERO;
    for (int code = 0; code < count; ++code) {
      if (!invertible || diff == 0 || code % p != 0) {
        final int[] f = new int[degree + 1];
        int value = code;
        for (int j = 0; j <= diff; ++j) {
          final int coefficient = j == diff ? 1 : value % p;
          value /= p;
          for (int k = 0; k < previous.length; ++k) {
            f[j + k] = mod(f[j + k] + (long) coefficient * previous[k], p);
          }
        }
        final int[] next = matrix.clone();
        for (int k = 0; k < degree; ++k) {
          if (k + 1 < degree) {
            next[(offset + k + 1) * DIM + offset + k] = 1;
          }
          next[(offset + k) * DIM + offset + degree - 1] = mod(-f[k], p);
        }
        sum = sum.add(invariantFactors(p, e, invertible, degrees, index + 1, offset + degree, f, next));
      }
    }
    return sum;
  }

  private static Z local(final Z q, final int e, final boolean invertible) {
    if (e == 1) {
      return invertible ? q.pow(4).subtract(q) : q.pow(4).add(q.pow(3)).add(q.square().multiply2()).add(q);
    }
    // Scalar reduction aI + pB leaves unrestricted similarity of B at
    // the preceding level, avoiding an orbit search on the largest space.
    Z total = local(q, e - 1, false).multiply(invertible ? q.subtract(1) : q);
    final IntegerPartition partitions = new IntegerPartition(DIM);
    int[] degrees;
    while ((degrees = partitions.next()) != null) {
      total = total.add(invariantFactors(q.intValueExact(), e, invertible, degrees, 0, 0, new int[] {1}, new int[ENTRIES]));
    }
    return total;
  }

  /**
   * Count conjugacy classes in GL(4,Z_n).
   * @param modulus positive modulus
   * @return number of classes
   */
  public static Z count(final long modulus) {
    final FactorSequence fs = Jaguar.factor(modulus);
    Z total = Z.ONE;
    for (final Z p : fs.toZArray()) {
      total = total.multiply(local(p, fs.getExponent(p), true));
    }
    return total;
  }
}
