package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027385 Number of primitive polynomials of degree n over GF(3).
 * @author Sean A. Irvine
 */
public class A027385 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mA = mA.multiply(3);
    ++mN;
    return Jaguar.factor(mA.subtract(1)).phi().divide(mN);
  }
}
