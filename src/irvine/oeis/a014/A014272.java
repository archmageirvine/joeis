package irvine.oeis.a014;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A014272.
 * @author Sean A. Irvine
 */
public class A014272 extends A014271 {

  @Override
  public Z next() {
    super.next();
    final Polynomial<Z> t = RING.subtract(mB, RING.pow(mB, 2, mN));
    return t.coeff(mN).add(mN == 3 ? 1 : 0);
  }
}

