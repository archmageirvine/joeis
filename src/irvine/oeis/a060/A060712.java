package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060712 Smallest number whose sum of digits is 3^n.
 * @author Sean A. Irvine
 */
public class A060712 extends Sequence0 {

  // After Harry J. Smith

  private int mN = -1;

  @Override
  public Z next() {
    final Z s = Z.THREE.pow(++mN);
    final Z x = s.divide(9);
    final Z d = s.subtract(x.multiply(9));
    return d.add(1).multiply(Z.TEN.pow(x)).subtract(1);
  }
}
