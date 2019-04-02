package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCRFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000319 a(n) = floor(b(n)), where b(n)=tan(b(n-1)), b(0)=1.
 * @author Sean A. Irvine
 */
public class A000319 implements Sequence {
  
  // Fixed precision arithmetic offers a more efficient way of computing
  // this sequence.  Here we use exact constructible reals.

  private CR mTanValue = null;
  
  @Override
  public Z next() {
    if (mTanValue == null) {
      mTanValue = CR.ONE;
    } else {
      mTanValue = UnaryCRFunction.TAN.execute(mTanValue);
    }
    return mTanValue.floor(32);
  }  
}
