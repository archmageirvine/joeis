package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001673 a(n) = ceiling(Pi^n).
 * @author Sean A. Irvine
 */
public class A001673 extends Sequence0 {

  private CR mPi = null;

  @Override
  public Z next() {
    if (mPi == null) {
      mPi = CR.ONE;
    } else {
      mPi = mPi.multiply(CR.PI);
    }
    return mPi.ceil();
  }
}
