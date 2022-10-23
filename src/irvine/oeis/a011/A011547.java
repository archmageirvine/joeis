package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011547 Decimal expansion of sqrt(2) truncated to n places.
 * @author Sean A. Irvine
 */
public class A011547 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return CR.SQRT2.multiply(mA).floor();
  }
}
