package irvine.oeis.a011;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011260 Number of primitive polynomials of degree n over GF(2).
 * @author Sean A. Irvine
 */
public class A011260 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Euler.phi(Z.ONE.shiftLeft(mN).subtract(Z.ONE)).divide(mN);
  }
}

