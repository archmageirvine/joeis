package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006609.
 * @author Sean A. Irvine
 */
public class A006609 implements Sequence {

  private int mN = 2;
  private long mCount = 0;

  private void search(final long piUsed, final long pUsed, final int i) {
    if (i == mN) {
      ++mCount;
      return;
    }
    long piKey = 1;
    for (int k = 0; k <= mN; ++k, piKey <<= 1) {
      if ((piUsed & piKey) == 0) {
        final int p = (i + k) % mN;
        final long pKey = 1L << p;
        if ((pUsed & pKey) == 0) {
          search(piUsed | piKey, pUsed | pKey, i + 1);
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    search(1, 1, 1); // assume pi_0=0
    return Z.valueOf(mCount);
  }
}
