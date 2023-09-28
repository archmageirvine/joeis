package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065964.
 * @author Sean A. Irvine
 */
public class A066033 extends A000040 {

  private Z mSum = Z.FOUR;
  private boolean mSign = true;

  @Override
  public Z next() {
    mSign = !mSign;
    mSum = mSum.signedAdd(mSign, super.next());
    return mSum;
  }
}
