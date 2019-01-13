package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A003109.
 * @author Sean A. Irvine
 */
public class A003109 implements Sequence {

  // Cf. A006609 same code without need for determining even/odd
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private int mN = 1;
  private long mCount = 0;
  private int[] mPi = null;

  protected boolean accept() {
    return Permutation.isEven(mPi);
  }

  private void search(final long piUsed, final long pUsed, final int i) {
    if (i == mN) {
      if (accept()) {
        ++mCount;
        if (mVerbose && mCount % 10000000 == 0) {
          System.out.println("Count is now: " + mCount);
        }
      }
      return;
    }
    long piKey = 1;
    for (int k = 0; k <= mN; ++k, piKey <<= 1) {
      if ((piUsed & piKey) == 0) {
        final int p = (i + k) % mN;
        final long pKey = 1L << p;
        if ((pUsed & pKey) == 0) {
          mPi[i] = k;
          search(piUsed | piKey, pUsed | pKey, i + 1);
        }
      }
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mCount = 0;
    mPi = new int[mN];
    search(1, 1, 1); // assume pi_0=0
    return Z.valueOf(mCount);
  }
}
