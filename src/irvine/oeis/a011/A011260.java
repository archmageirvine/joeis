package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.math.z.Euler;
import irvine.oeis.Sequence;

/**
 * A011260 Number of primitive polynomials of degree n over <code>GF(2)</code>.
 * @author Sean A. Irvine
 */
public class A011260 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Euler.phi(Z.ONE.shiftLeft(mN).subtract(Z.ONE)).divide(mN);
  }
}

