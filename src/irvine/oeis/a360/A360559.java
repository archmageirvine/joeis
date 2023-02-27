package irvine.oeis.a360;

import irvine.math.z.Z;
import irvine.oeis.a006.A006530;

/**
 * A360559 allocated for Luca Onnis.
 * @author Sean A. Irvine
 */
public class A360559 extends A006530 {

  private boolean mSign = false;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    mSign = !mSign;
    mSum = mSum.signedAdd(mSign, super.next());
    return mSum;
  }
}
