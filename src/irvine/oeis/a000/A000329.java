package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000329 Nearest integer to b(n), where b(n) = tan(b(n-1)), b(0) = 1.
 * @author Sean A. Irvine
 */
public class A000329 extends Sequence0 {

  private CR mTanValue = null;
  
  @Override
  public Z next() {
    if (mTanValue == null) {
      mTanValue = CR.ONE;
    } else {
      mTanValue = UnaryCRFunction.TAN.execute(mTanValue);
    }
    return mTanValue.round();
  }  
}
