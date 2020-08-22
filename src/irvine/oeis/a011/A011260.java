package irvine.oeis.a011;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011260 Number of primitive polynomials of degree n over GF(2).
 * @author Sean A. Irvine
 */
public class A011260 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Jaguar.factor(Z.ONE.shiftLeft(mN).subtract(Z.ONE)).phi().divide(mN);
  }
}

