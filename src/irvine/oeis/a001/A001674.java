package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001674 a(n) = floor(sqrt( 2*Pi )^n).
 * @author Sean A. Irvine
 */
public class A001674 implements Sequence {

  private static final CR SQRT_TAU = CR.TAU.sqrt();
  private CR mX = null;

  @Override
  public Z next() {
    if (mX == null) {
      mX = CR.ONE;
    } else {
      mX = mX.multiply(SQRT_TAU);
    }
    return mX.floor(32);
  }
}
