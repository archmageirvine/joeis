package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000319 a(n) = floor(b(n)), where b(n) = tan(b(n-1)), b(0)=1.
 * @author Sean A. Irvine
 */
public class A000319 extends Sequence0 {
  
  // Fixed precision arithmetic offers a more efficient way of computing
  // this sequence.  Here we use exact constructible reals.

  private CR mTanValue = null;
  
  @Override
  public Z next() {
    if (mTanValue == null) {
      mTanValue = CR.ONE;
    } else {
      mTanValue = ComputableReals.SINGLETON.tan(mTanValue);
    }
    return mTanValue.floor();
  }  
}
