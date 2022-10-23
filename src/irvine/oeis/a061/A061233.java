package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061233 Pierce expansion for 4 - Pi.
 * @author Sean A. Irvine
 */
public class A061233 extends Sequence0 {

  // Alternating Engel expansion

  private CR mA = CR.FOUR.subtract(CR.PI);

  @Override
  public Z next() {
    final Z a = mA.inverse().floor();
    mA = CR.ONE.subtract(mA.multiply(a));
    return a;
  }
}
