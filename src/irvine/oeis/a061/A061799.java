package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A061799 Smallest number with at least n divisors.
 * @author Sean A. Irvine
 */
public class A061799 extends A000005 {

  private Z mDiv = Z.ZERO;
  private Z mM = Z.ONE;
  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    mK = mK.add(1);
    while (true) {
      if (mDiv.compareTo(mK) >= 0) {
        return mM;
      }
      final Z d = super.next();
      if (d.compareTo(mDiv) > 0) {
        mDiv = d;
        mM = Z.valueOf(mN);
      }
    }
  }
}

