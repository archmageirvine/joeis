package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A072068 Number of integer solutions to the equation 2x^2+y^2+8z^2=m for an odd number m=2n-1.
 * @author Sean A. Irvine
 */
public class A072068 implements Sequence {

  private final LongDynamicLongArray mCount = new LongDynamicLongArray();
  private long mN = start() - 1;
  private long mXMax = 0;
  private long mYMax = 0;
  private long mZMax = 0;

  protected long start() {
    return 1;
  }

  protected long getN(final long x, final long y, final long z) {
    return 2 * x * x + y * y + 8 * z * z;
  }

  protected boolean testN(final long n) {
    return (n & 1) == 1;
  }

  protected long indexN(final long n) {
    return (n + 1) / 2;
  }

  private void compute(final long x, final long y, final long z) {
    final long n = getN(x, y, z);
    if (testN(n)) {
      long s = 8;
      if (x == 0) {
        s /= 2;
      }
      if (y == 0) {
        s /= 2;
      }
      if (z == 0) {
        s /= 2;
      }
      final long m = indexN(n);
      mCount.set(m, mCount.get(m) + s);
    }
  }

  protected long xLimit(final long maxN) {
    return (long) Math.ceil(Math.sqrt(maxN >>> 1)) + 1;
  }

  protected long yLimit(final long maxN) {
    return (long) Math.ceil(Math.sqrt(maxN)) + 1;
  }

  protected long zLimit(final long maxN) {
    return (long) Math.ceil(Math.sqrt(maxN >>> 3)) + 1;
  }

  private void compute(final long n) {
    final long maxN = n * 2;
    final long xMax = xLimit(maxN);
    final long yMax = yLimit(maxN);
    final long zMax = zLimit(maxN);
    if (n > start()) {
      // Increment in z direction
      if (zMax > mZMax) {
        for (long x = 0; x < mXMax; ++x) {
          for (long y = 0; y < mYMax; ++y) {
            for (long z = mZMax; z < zMax; ++z) {
              compute(x, y, z);
            }
          }
        }
      }
      // Increment in y direction
      if (yMax > mYMax) {
        for (long x = 0; x < mXMax; ++x) {
          for (long y = mYMax; y < yMax; ++y) {
            for (long z = 0; z < mZMax; ++z) {
              compute(x, y, z);
            }
          }
        }
      }
      // Increment in x direction
      for (long x = mXMax; x < xMax; ++x) {
        for (long y = 0; y < yMax; ++y) {
          for (long z = 0; z < zMax; ++z) {
            compute(x, y, z);
          }
        }
      }
    }
    // Increment in all directions
    for (long x = mXMax; x < xMax; ++x) {
      for (long y = mYMax; y < yMax; ++y) {
        for (long z = mZMax; z < zMax; ++z) {
          compute(x, y, z);
        }
      }
    }
    mXMax = xMax;
    mYMax = yMax;
    mZMax = zMax;
  }

  @Override
  public Z next() {
    compute(++mN);
    return Z.valueOf(mCount.get(mN));
  }
}
