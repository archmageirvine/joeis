package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001673 <code>a(n) = ceiling(Pi^n)</code>.
 * @author Sean A. Irvine
 */
public class A001673 implements Sequence {

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
