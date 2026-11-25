package irvine.math.group;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Counts abelian subgroups of GL(n,2).
 * @author Gregory Morse
 */
public final class BinaryAbelianSubgroups {

  private final BinaryAbelianUnipotent mUnipotent = new BinaryAbelianUnipotent();
  private Z mRankThreeOverFour = null;

  private static final class CyclicProduct {
    private final List<Integer> mOrders;
    private final int mOrder;
    private final int[][] mCoordinates;
    private final int[][] mSum;
    private final int[] mPlace;

    private CyclicProduct(final List<Integer> orders) {
      mOrders = orders;
      mPlace = new int[orders.size()];
      int z = 1;
      for (int i = 0; i < orders.size(); ++i) {
        mPlace[i] = z;
        z = Math.multiplyExact(z, orders.get(i));
      }
      mOrder = z;
      mCoordinates = new int[mOrder][orders.size()];
      for (int x = 0; x < mOrder; ++x) {
        for (int i = 0; i < orders.size(); ++i) {
          mCoordinates[x][i] = (x / mPlace[i]) % orders.get(i);
        }
      }
      mSum = new int[mOrder][mOrder];
      for (int x = 0; x < mOrder; ++x) {
        for (int y = 0; y < mOrder; ++y) {
          for (int i = 0; i < orders.size(); ++i) {
            mSum[x][y] += mPlace[i] * ((mCoordinates[x][i] + mCoordinates[y][i]) % orders.get(i));
          }
        }
      }
    }

    private int scale(final int x, final int factor) {
      int s = 0;
      for (int i = 0; i < mPlace.length; ++i) {
        s += mPlace[i] * ((mCoordinates[x][i] * factor) % mOrders.get(i));
      }
      return s;
    }

    private BitSet extend(final BitSet h, final int x) {
      final BitSet abelian = (BitSet) h.clone();
      for (int y = h.nextSetBit(0); y >= 0; y = h.nextSetBit(y + 1)) {
        int z = mSum[y][x];
        while (!abelian.get(z)) {
          abelian.set(z);
          z = mSum[z][x];
        }
      }
      return abelian;
    }

    private static BitSet trivial() {
      final BitSet h = new BitSet();
      h.set(0);
      return h;
    }

    private List<Integer> type(final BitSet h) {
      final int order = h.cardinality();
      final List<Integer> type = new ArrayList<>();
      for (final Z prime : Jaguar.factor(order).toZArray()) {
        final int p = prime.intValueExact();
        final List<Integer> ranks = new ArrayList<>();
        for (int power = p, previous = 1; power <= order; power *= p) {
          int killed = 0;
          for (int x = h.nextSetBit(0); x >= 0; x = h.nextSetBit(x + 1)) {
            if (scale(x, power) == 0) {
              ++killed;
            }
          }
          int r = 0;
          for (int z = killed / previous; z > 1; z /= p) {
            ++r;
          }
          ranks.add(r);
          previous = killed;
        }
        for (int j = 0, power = p; j < ranks.size(); ++j, power *= p) {
          final int next = j + 1 == ranks.size() ? 0 : ranks.get(j + 1);
          for (int k = next; k < ranks.get(j); ++k) {
            type.add(power);
          }
        }
      }
      type.sort(Integer::compareTo);
      return type;
    }

    private void addTypes(final Set<List<Integer>> out) {
      final List<BitSet> subgroups = new ArrayList<>();
      final Set<BitSet> known = new HashSet<>();
      final BitSet trivial = trivial();
      subgroups.add(trivial);
      known.add(trivial);
      for (int j = 0; j < subgroups.size(); ++j) {
        final BitSet h = subgroups.get(j);
        if (j != 0) {
          out.add(type(h));
        }
        for (int x = h.nextClearBit(1); x < mOrder; x = h.nextClearBit(x + 1)) {
          final BitSet next = extend(h, x);
          if (known.add(next)) {
            subgroups.add(next);
          }
        }
      }
    }

    private long aut(final int i, final BitSet generated) {
      if (i == mOrders.size()) {
        return generated.cardinality() == mOrder ? 1 : 0;
      }
      long sum = 0;
      for (int x = 0; x < mOrder; ++x) {
        if (scale(x, mOrders.get(i)) == 0) {
          sum += aut(i + 1, extend(generated, x));
        }
      }
      return sum;
    }

    private List<CharacterOrbit> characterOrbits() {
      final List<CharacterOrbit> orbits = new ArrayList<>();
      final BitSet seen = new BitSet(mOrder);
      for (int x = seen.nextClearBit(0); x < mOrder; x = seen.nextClearBit(x + 1)) {
        int degree = 0;
        for (int y = x; !seen.get(y); y = scale(y, 2)) {
          seen.set(y);
          ++degree;
        }
        long kernel = 0;
        for (int y = 0; y < mOrder; ++y) {
          int e = 0;
          for (int i = 0; i < mOrders.size(); ++i) {
            e += mCoordinates[x][i] * mCoordinates[y][i] * (mOrder / mOrders.get(i));
          }
          if (e % mOrder == 0) {
            kernel |= 1L << y;
          }
        }
        orbits.add(new CharacterOrbit(degree, kernel));
      }
      return orbits;
    }
  }

  private static final class CharacterOrbit {
    private final int mDegree;
    private final long mKernel;

    private CharacterOrbit(final int degree, final long kernel) {
      mDegree = degree;
      mKernel = kernel;
    }
  }

  private static final class Factor {
    private final int mMultiplicity;
    private final int mDegree;

    private Factor(final int multiplicity, final int degree) {
      mMultiplicity = multiplicity;
      mDegree = degree;
    }
  }

  private static int multiplyFour(final int a, final int b) {
    final int c = ((a & 1) == 0 ? 0 : b) ^ ((a & 2) == 0 ? 0 : b << 1);
    return (c & 4) == 0 ? c : c ^ 7;
  }

  private static Z rankThreeOverFour() {
    final short[][] product = new short[64][64];
    for (int x = 0; x < product.length; ++x) {
      for (int y = 0; y < product.length; ++y) {
        final int cross = multiplyFour((x >>> 2) & 3, y >>> 4);
        product[x][y] = (short) (x ^ y ^ cross);
      }
    }
    final List<int[]> lines = new ArrayList<>();
    for (int c = 0; c < 64; ++c) {
      final int x = c & 3;
      final int y = (c >>> 2) & 3;
      final int z = c >>> 4;
      if ((x != 0 ? x : y != 0 ? y : z) == 1) {
        lines.add(new int[] {x, y, z});
      }
    }
    // A complete flag consists of a line and the kernel of a covector
    // vanishing on that line. Unipotent generators act trivially on the
    // line and on the one-dimensional quotient of the plane.
    final List<int[]> flags = new ArrayList<>();
    for (final int[] u : lines) {
      for (final int[] v : lines) {
        if ((multiplyFour(u[0], v[0]) ^ multiplyFour(u[1], v[1]) ^ multiplyFour(u[2], v[2])) == 0) {
          flags.add(new int[] {u[0], u[1], v[1], v[2]});
        }
      }
    }
    final boolean[][] fixes = new boolean[64][flags.size()];
    for (int g = 0; g < fixes.length; ++g) {
      final int a = (g >>> 2) & 3;
      final int b = g >>> 4;
      final int c = g & 3;
      for (int i = 0; i < flags.size(); ++i) {
        final int[] f = flags.get(i);
        fixes[g][i] = multiplyFour(f[0], a) == 0
          && (multiplyFour(f[0], c) ^ multiplyFour(f[1], b)) == 0
          && (multiplyFour(a, f[2]) ^ multiplyFour(c, f[3])) == 0
          && multiplyFour(b, f[3]) == 0;
      }
    }
    final Map<Integer, Long> weights = new HashMap<>();
    AbelianSylowSubgroups.visit(product, (g, h) -> {
      int count = 0;
      for (int i = 0; i < flags.size(); ++i) {
        boolean ok = true;
        for (final int x : g) {
          if (!fixes[x][i]) {
            ok = false;
            break;
          }
        }
        if (ok) {
          ++count;
        }
      }
      weights.merge(count, 1L, Long::sum);
    });
    Q sum = Q.ZERO;
    for (final Map.Entry<Integer, Long> w : weights.entrySet()) {
      sum = sum.add(new Q(w.getValue() * flags.size(), w.getKey()));
    }
    return sum.toZ();
  }

  private Z unipotentInCentralizer(final List<Factor> factors) {
    if (factors.isEmpty()) {
      return Z.ONE;
    }
    final Factor f = factors.get(0);
    if (factors.size() == 1) {
      if (f.mDegree == 1) {
        return mUnipotent.count(f.mMultiplicity);
      }
      if (f.mMultiplicity == 2) {
        // Nontrivial p-subgroups of GL(2,q) are in a unique Sylow.
        return BinaryAbelianUnipotent.subspaceCount(f.mDegree).subtract(1)
          .multiply((1 << f.mDegree) + 1).add(1);
      }
      if (f.mMultiplicity == 3 && f.mDegree == 2) {
        if (mRankThreeOverFour == null) {
          mRankThreeOverFour = rankThreeOverFour();
        }
        return mRankThreeOverFour;
      }
    }
    if (factors.size() == 2 && f.mMultiplicity == 2 && factors.get(1).mMultiplicity == 2) {
      final int a = f.mDegree;
      final int b = factors.get(1).mDegree;
      final int mask = (1 << a) - 1;
      long sum = 0;
      // Both Sylows are elementary abelian. Each nonzero projection
      // determines its Sylow, whereas the zero projection has weight 1.
      for (final int[] h : mUnipotent.subspaces(a + b)) {
        int support = 0;
        for (final int x : h) {
          support |= x;
        }
        sum += ((support & mask) == 0 ? 1 : (1 << a) + 1) * ((support >>> a) == 0 ? 1 : (1 << b) + 1);
      }
      return Z.valueOf(sum);
    }
    throw new UnsupportedOperationException("Centralizer beyond the implemented ranks");
  }

  private Z embeddings(final List<CharacterOrbit> chars, final int index, final int dim,
                       final long kernel, final List<Factor> factors, final Z centralizer, final Z groupOrder) {
    if (dim == 0) {
      return kernel == 1 ? groupOrder.divide(centralizer).multiply(unipotentInCentralizer(factors)) : Z.ZERO;
    }
    if (index == chars.size()) {
      return Z.ZERO;
    }
    Z sum = embeddings(chars, index + 1, dim, kernel, factors, centralizer, groupOrder);
    final CharacterOrbit rep = chars.get(index);
    final Z q = Z.ONE.shiftLeft(rep.mDegree);
    for (int m = 1; m * rep.mDegree <= dim; ++m) {
      if (m > 1) {
        factors.add(new Factor(m, rep.mDegree));
      }
      sum = sum.add(embeddings(chars, index + 1, dim - m * rep.mDegree, kernel & rep.mKernel, factors,
        centralizer.multiply(LinearGroupOrder.general(m, q)), groupOrder));
      if (m > 1) {
        factors.remove(factors.size() - 1);
      }
    }
    return sum;
  }

  private Z oddPart(final int n) {
    // Every odd abelian subgroup is contained in a maximal torus.
    // Only its abstract isomorphism type is needed here.
    final Set<List<Integer>> types = new HashSet<>();
    final IntegerPartition parts = new IntegerPartition(n);
    int[] partition;
    while ((partition = parts.next()) != null) {
      final List<Integer> orders = new ArrayList<>();
      for (final int d : partition) {
        if (d > 1) {
          orders.add((1 << d) - 1);
        }
      }
      new CyclicProduct(orders).addTypes(types);
    }
    final Z g = LinearGroupOrder.general(n, Z.TWO);
    Z answer = Z.ZERO;
    for (final List<Integer> type : types) {
      final CyclicProduct h = new CyclicProduct(type);
      // Faithful representations of an abstract odd subgroup H are
      // specified by multisets of Frobenius orbits of characters.
      // Count their conjugates, then divide by the number of labellings
      // of H. An abelian 2-subgroup may be chosen in its centralizer.
      final Z mass = embeddings(h.characterOrbits(), 0, n, (1L << h.mOrder) - 1,
        new ArrayList<>(), Z.ONE, g);
      final Z[] qr = mass.divideAndRemainder(h.aut(0, CyclicProduct.trivial()));
      if (!qr[1].isZero()) {
        throw new IllegalStateException("Nonintegral embedding count");
      }
      answer = answer.add(qr[0]);
    }
    return answer;
  }

  /**
   * Count abelian subgroups of GL(n,2).
   * @param n dimension
   * @return subgroup count
   */
  public Z count(final int n) {
    if (n > 6) {
      throw new UnsupportedOperationException("Projection groups exceed the packed Sylow census");
    }
    return mUnipotent.count(n).add(oddPart(n));
  }
}
