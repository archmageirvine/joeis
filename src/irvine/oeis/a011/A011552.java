package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011552 Decimal expansion of phi rounded to n places.
 * @author Sean A. Irvine
 */
public class A011552 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return CR.PHI.multiply(mA).round();
  }
}
