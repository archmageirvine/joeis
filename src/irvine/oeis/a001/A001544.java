package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001544 A nonlinear recurrence.
 * @author Sean A. Irvine
 */
public class A001544 extends Sequence0 {

  private Z mP = null;

  @Override
  public Z next() {
    if (mP == null) {
      mP = Z.ONE;
    } else if (Z.ONE.equals(mP)) {
      mP = Z.SEVEN;
    } else {
      mP = mP.square().subtract(mP.multiply(6)).add(6);
    }
    return mP;
  }
}
