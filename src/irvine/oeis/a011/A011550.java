package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011550 Decimal expansion of <code>sqrt(3)</code> rounded to n places.
 * @author Sean A. Irvine
 */
public class A011550 implements Sequence {

  private static final CR N = CR.THREE.sqrt();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return N.multiply(mA).round();
  }
}
