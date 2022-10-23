package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056557 Second tetrahedral coordinate.
 * @author Sean A. Irvine
 */
public class A056557 extends Sequence0 {

  private long[] mN = null;

  protected Z select(final long[] n) {
    return Z.valueOf(n[1]);
  }

  @Override
  public Z next() {
    if (mN == null) {
      mN = new long[3];
    } else {
      for (int k = mN.length - 1; k >= 0; --k) {
        ++mN[k];
        if (k == 0 || mN[k] <= mN[k - 1]) {
          break;
        }
        mN[k] = 0;
      }
    }
    return select(mN);
  }
}
