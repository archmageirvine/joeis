package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011550 Decimal expansion of sqrt(3) rounded to n places.
 * @author Sean A. Irvine
 */
public class A011550 extends Sequence0 {

  private static final CR N = CR.THREE.sqrt();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return N.multiply(mA).round();
  }
}
