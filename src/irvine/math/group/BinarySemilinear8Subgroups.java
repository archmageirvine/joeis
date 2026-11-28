package irvine.math.group;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Census of irreducible semilinear subgroups in dimension six over GF(2).
 * @author Gregory Morse
 */
final class BinarySemilinear8Subgroups {

  private static final int SIZE = 8;
  private static final int FLAGS = 12;
  private static final int DIMENSION = 6;
  private static final int IDENTITY = 1 | (1 << 9);
  private final int[][] mProduct = new int[SIZE][SIZE];
  private final int[][] mPower = new int[3][SIZE];
  private final int[] mInverse = new int[SIZE];
  private final Map<Long, Integer> mEncoding = new HashMap<>();
  private final BinaryParabolicSubgroups mGroup;
  private int mClasses;
  private long mTotal;

  BinarySemilinear8Subgroups(final BinaryWreathSubgroups wreath) {
    for (int a = 0; a < SIZE; ++a) {
      for (int b = 0; b < SIZE; ++b) {
        int product = 0;
        int x = a;
        for (int y = b; y != 0; y >>>= 1) {
          if ((y & 1) != 0) {
            product ^= x;
          }
          x <<= 1;
          if ((x & SIZE) != 0) {
            x ^= 11; // x^3+x+1.
          }
        }
        mProduct[a][b] = product;
        if (product == 1) {
          mInverse[a] = b;
        }
      }
      mPower[0][a] = a;
      mPower[1][a] = mProduct[a][a];
    }
    for (int a = 0; a < SIZE; ++a) {
      mPower[2][a] = mPower[1][mPower[1][a]];
    }
    final int[] elements = new int[3 * (64 - 1) * (64 - 8)];
    int length = 0;
    for (int x = 0; x < (1 << FLAGS); ++x) {
      if (determinant(x) != 0) {
        for (int t = 0; t < 3; ++t) {
          final int g = x | (t << FLAGS);
          elements[length++] = g;
          if (mEncoding.put(matrix(g), g) != null) {
            throw new IllegalStateException("Nonfaithful semilinear action");
          }
        }
      }
    }
    if (length != elements.length) {
      throw new IllegalStateException("Wrong semilinear group order");
    }
    final int[] generators = {pack(1, 1, 0, 1, 0), pack(1, 0, 1, 1, 0),
      pack(1, 2, 0, 1, 0), pack(1, 0, 2, 1, 0), pack(1, 4, 0, 1, 0), pack(1, 0, 4, 1, 0),
      pack(2, 0, 0, 1, 0), pack(1, 0, 0, 1, 1)};
    if (new BinaryStrongChain(DIMENSION, Arrays.stream(generators).mapToLong(this::matrix).toArray()).order() != elements.length) {
      throw new IllegalStateException("Semilinear generators do not cover the group");
    }
    mGroup = BinaryParabolicSubgroups.explicit(IDENTITY, elements, generators, this::multiply, this::inverse);
    count(wreath);
  }

  private static int pack(final int a, final int b, final int c, final int d, final int power) {
    return a | (b << 3) | (c << 6) | (d << 9) | (power << FLAGS);
  }

  private int determinant(final int x) {
    return mProduct[x & 7][(x >>> 9) & 7] ^ mProduct[(x >>> 3) & 7][(x >>> 6) & 7];
  }

  private int multiply(final int x, final int y) {
    final int t = x >>> FLAGS;
    final int[] power = mPower[t];
    final int a = x & 7;
    final int b = (x >>> 3) & 7;
    final int c = (x >>> 6) & 7;
    final int d = (x >>> 9) & 7;
    final int e = power[y & 7];
    final int f = power[(y >>> 3) & 7];
    final int g = power[(y >>> 6) & 7];
    final int h = power[(y >>> 9) & 7];
    return pack(mProduct[a][e] ^ mProduct[b][g], mProduct[a][f] ^ mProduct[b][h],
      mProduct[c][e] ^ mProduct[d][g], mProduct[c][f] ^ mProduct[d][h], (t + (y >>> FLAGS)) % 3);
  }

  private int inverse(final int x) {
    final int t = (3 - (x >>> FLAGS)) % 3;
    final int[] power = mPower[t];
    final int reciprocal = mInverse[determinant(x)];
    return pack(power[mProduct[reciprocal][(x >>> 9) & 7]], power[mProduct[reciprocal][(x >>> 3) & 7]],
      power[mProduct[reciprocal][(x >>> 6) & 7]], power[mProduct[reciprocal][x & 7]], t);
  }

  private long matrix(final int x) {
    final int[] power = mPower[x >>> FLAGS];
    long result = 0;
    for (int i = 0; i < 3; ++i) {
      final int y = power[1 << i];
      final int u = mProduct[x & 7][y] | (mProduct[(x >>> 6) & 7][y] << 3);
      final int v = mProduct[(x >>> 3) & 7][y] | (mProduct[(x >>> 9) & 7][y] << 3);
      result |= ((long) u << (DIMENSION * i)) | ((long) v << (DIMENSION * (i + 3)));
    }
    return result;
  }

  private int inField(final long field, final long[] generators, final int requiredOrder) {
    final long change = BinaryNormalizedFields.basis(field, 3);
    final long back = BinaryLinearActions.inverse(change, DIMENSION);
    final int[] gens = new int[generators.length];
    for (int i = 0; i < gens.length; ++i) {
      final Integer code = mEncoding.get(BinaryLinearActions.multiply(BinaryLinearActions.multiply(back, generators[i], DIMENSION), change, DIMENSION));
      if (code == null) {
        throw new IllegalStateException("Field transporter is not semilinear");
      }
      gens[i] = code;
    }
    final BitSet seen = new BitSet();
    final int[] elements = new int[requiredOrder];
    elements[0] = IDENTITY;
    seen.set(IDENTITY);
    int size = 1;
    for (int i = 0; i < size; ++i) {
      for (final int g : gens) {
        final int x = multiply(elements[i], g);
        if (!seen.get(x)) {
          seen.set(x);
          elements[size++] = x;
        }
      }
    }
    if (size != requiredOrder) {
      throw new IllegalStateException("Wrong subgroup order after changing field basis");
    }
    return mGroup.locate(elements).mEntry.mIndex;
  }

  private void count(final BinaryWreathSubgroups wreath) {
    final long ambient = LinearGroupOrder.general(DIMENSION, Z.TWO).longValueExact();
    final BitSet fused = new BitSet();
    Q incidence = Q.ZERO;
    for (final BinaryParabolicSubgroups.Entry h : mGroup.mRepresentatives) {
      final long[] generators = Arrays.stream(h.mGenerators).mapToLong(this::matrix).toArray();
      if (!BinaryWreathSubgroups.irreducible(generators) || wreath.decompositions(generators) != 0) {
        continue;
      }
      final List<Long> fields = BinaryNormalizedFields.cubic(h.mElements, h.mGenerators, IDENTITY, this::multiply, this::matrix);
      if (fields.isEmpty()) {
        throw new IllegalStateException("Missing the defining field");
      }
      incidence = incidence.add(new Q(h.mClassSize, fields.size()));
      if (!fused.get(h.mIndex)) {
        int fixed = 0;
        for (final long x : fields) {
          final int label = inField(x, generators, h.mOrder);
          if (label == h.mIndex) {
            ++fixed;
          }
          fused.set(label);
        }
        final long normalizer = (mGroup.order() / h.mClassSize) * (long) fixed;
        if (normalizer == 0 || ambient % normalizer != 0) {
          throw new IllegalStateException("Wrong ambient field normalizer");
        }
        ++mClasses;
        mTotal = Math.addExact(mTotal, ambient / normalizer);
      }
    }
    if (!incidence.multiply(ambient / mGroup.order()).equals(new Q(mTotal))) {
      throw new IllegalStateException("Semilinear incidence and class counts disagree");
    }
  }

  int classes() {
    return mClasses;
  }

  long total() {
    return mTotal;
  }
}
