package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001698 <code>a(n) = ceiling(sqrt( 2*Pi )^n)</code>.
 * @author Sean A. Irvine
 */
public class A001698 implements Sequence {

  private static final CR SQRT_TAU = CR.TAU.sqrt();
  private CR mX = null;

  @Override
  public Z next() {
    if (mX == null) {
      mX = CR.ONE;
    } else {
      mX = mX.multiply(SQRT_TAU);
    }
    return mX.ceil();
  }
}
