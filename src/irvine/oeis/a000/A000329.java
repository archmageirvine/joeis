package irvine.oeis.a000;

import irvine.oeis.Sequence;
import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.math.z.Z;

/**
 * A000329 Nearest integer to <code>b(n),</code> where <code>b(n) =</code> tan(b(n-1)), <code>b(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A000329 implements Sequence {

  private CR mTanValue = null;
  
  @Override
  public Z next() {
    if (mTanValue == null) {
      mTanValue = CR.ONE;
    } else {
      mTanValue = UnaryCRFunction.TAN.execute(mTanValue);
    }
    return mTanValue.toZ();
  }  
}
