package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011549 a(n) = floor(sqrt(3)*10^n).
 * @author Sean A. Irvine
 */
public class A011549 extends Sequence0 {

  private static final CR N = CR.THREE.sqrt();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return N.multiply(mA).floor();
  }
}
