package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003111 Number of complete mappings of the cyclic group <code>Z_{2n+1}</code>.
 * @author Sean A. Irvine
 */
public class A003111 implements Sequence {

  protected int mN = -1;
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
    mN += 2;
    mCount = 0;
    search(1, 1, 1); // assume pi_0=0
    return Z.valueOf(mCount);
  }
}
