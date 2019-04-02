package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A061233 Pierce expansion for 4 - Pi.
 * @author Sean A. Irvine
 */
public class A061233 implements Sequence {

  // Alternating Engel expansion

  private CR mA = CR.FOUR.subtract(CR.PI);

  @Override
  public Z next() {
    final Z a = mA.inverse().floor(32);
    mA = CR.ONE.subtract(mA.multiply(CR.valueOf(a)));
    return a;
  }
}
