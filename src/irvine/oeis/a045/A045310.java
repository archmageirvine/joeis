package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045310 Number of matchings in n-cube.
 * @author Hugo van der Sanden (C implementation)
 * @author Sean A. Irvine
 */
public class A045310 implements Sequence {

  // Based on https://github.com/hvds/seq/blob/master/part/find2c.c

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;

  /* We rely on long to be an integer type
   * with at least 2^MAX_DIMENSION bits
   */
  private static final int MAX_DIMENSION = 6;
  private static final long[] FULL_MASK = {
    0x0000000000000001L,
    0x0000000000000003L,
    0x000000000000000fL,
    0x00000000000000ffL,
    0x000000000000ffffL,
    0x00000000ffffffffL,
    0xffffffffffffffffL
  };

  {
    assert 1L << MAX_DIMENSION <= Long.SIZE;
  }

  private int mStep = 0;

  private final Z[] mSum = new Z[MAX_DIMENSION + 1];
  private final Z[] mScratch = new Z[MAX_DIMENSION + 1];

  /*
   * countPart(d, mask): set mSum[d] to the number of ways the specified
   * shape can be partitioned into polyominoes of size at most 2.
   * The shape is some or all of a I<d>-dimensional hypercube of side 2;
   * I<mask> is a vector of C<2^d> bits specifying the unit I<d>-cubes
   * that are included in the shape.
   *
   * Overwrites scratch[0..d] and sum[0..d] during calculation.
   */
  private void countPart(int d, long mask) {
    if (d == 0) {
      mSum[d] = Z.ONE;
      return;
    }
    final long left = mask & FULL_MASK[d - 1];
    final long right = mask >> (1 << (d - 1));
    final long shared = left & right;

    long u = 0;
    mSum[d] = Z.ZERO;
    do {
      countPart(d - 1, left ^ u);
      mScratch[d] = mSum[d - 1];
      countPart(d - 1, right ^ u);
      mScratch[d] = mScratch[d].multiply(mSum[d - 1]);
      mSum[d] = mSum[d].add(mScratch[d]);
      u = (u - shared) & shared;
    } while (u != 0);
  }

  /*
   * countFull(d): same as countPart(d, fullmask[d])
   */
  private void countFull(int d) {
    if (d == 0) {
      mSum[d] = Z.ONE;
      return;
    }
    final long lim = FULL_MASK[d - 1];
    mSum[d] = Z.ZERO;
    for (long u = 0; u <= lim; ++u) {
      countPart(d - 1, u);
      mScratch[d] = mSum[d - 1].square();
      mSum[d] = mSum[d].add(mScratch[d]);
      if (mVerbose && (++mStep & 0xfffff) == 0) {
        System.out.printf("300 at (%d, %x) sum is %s%n", d, u, mSum[d]);
      }
    }
  }

  private static final int LIM4 = 1 << (1 << 4);
  private final int[] mCache4 = new int[LIM4];  /* the sum of these is 41025, int is ample room */

  private void initCache4() {
    for (int u = 0; u < LIM4; ++u) {
      countPart(4, u);
      mCache4[u] = mSum[4].intValueExact();
    }
  }

  /*
   * count5Part(mask): same as count_part(5, mask)
   *
   * Uses a prepared cache of results for d=4, to minimize recursion.
   */
  private void count5Part(long mask) {
    final long left = mask & FULL_MASK[4];
    final long right = mask >> (1 << 4);
    final long shared = left & right;
    long u = 0;
    mSum[5] = Z.ZERO;
    do {
      mSum[5] = mSum[5].add(mCache4[(int) (left ^ u)] * mCache4[(int) (right ^ u)]);
      u = (u - shared) & shared;
    } while (u != 0);
  }

  /*
   * count_6_full(): same as count_full(6)
   *
   * Uses a prepared cache of results for d=4 (via count_5_part()) to reduce
   * recursion at a reasonable memory cost.
   */
  private void count6Full() {
    initCache4();
    long lim = FULL_MASK[5];
    mSum[6] = Z.ZERO;
    for (long u = 0; u <= lim; ++u) {
      count5Part(u);
      mScratch[6] = mSum[5].square();
      mSum[6] = mSum[6].add(mScratch[6]);
      if (mVerbose && (++mStep & 0x3ffffff) == 0) {
        System.out.printf("300 at (%d, %x) sum is %s%n", 6, u, mSum[6]);
      }
    }
  }

  /*
   * Calculates the number of ways a I<d>-dimensional hypercube of side 2
   * can be partitioned into polyominoes of size at most 2.
   */
  @Override
  public Z next() {
    int d = ++mN;
    if (d < 0 || d > MAX_DIMENSION) {
      throw new UnsupportedOperationException("dimension must be in the range 0 to " + MAX_DIMENSION);
    }
    if (d == 6) {
      count6Full();
    } else {
      countFull(d);
    }
    return mSum[d];
  }
}
