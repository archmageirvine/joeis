package irvine.oeis.a027;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027385 Number of primitive polynomials of degree n over GF(3).
 * @author Sean A. Irvine
 */
public class A027385 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA.multiply(3);
    return Euler.phi(mA.subtract(1)).divide(++mN);
  }
}
