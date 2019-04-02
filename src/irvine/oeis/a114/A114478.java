package irvine.oeis.a114;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A114478 Triangle read by rows; n-th row begins with n and contains n nonprimes greater than n and not already used.
 * @author Sean A. Irvine
 */
public class A114478 implements Sequence {

  private final DynamicLongArray mUsed = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private long mSmallestUnused = 1;
  private int mRow = 0;
  private int mPositionInRow = 0;

  private boolean used(final long n) {
    final int m = (int) (n >>> 6);
    final long b = 1L << (n & 0x3F);
    return (mUsed.get(m) & b) != 0;
  }

  private void use(final long n) {
    final int m = (int) (n >>> 6);
    final long b = 1L << (n & 0x3F);
    mUsed.set(m, mUsed.get(m) + b);
  }

  @Override
  public Z next() {
    if (mPositionInRow >= mRow) {
      // start a new row
      ++mRow;
      mPositionInRow = 0;
      mSmallestUnused = Math.max(mRow + 1, mSmallestUnused);
      return Z.valueOf(mRow);
    } else {
      // find next unused
      while (mPrime.isPrime(mSmallestUnused) || used(mSmallestUnused)) {
        ++mSmallestUnused;
      }
      use(mSmallestUnused);
      ++mPositionInRow;
      return Z.valueOf(mSmallestUnused++);
    }
  }
}

