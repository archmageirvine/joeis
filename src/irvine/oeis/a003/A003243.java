package irvine.oeis.a003;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A003243.
 * @author Sean A. Irvine
 */
public class A003243 extends A003240 {

  private int mN = 0;

  private Polynomial<Z> alpha() {
    final Polynomial<Z> t2 = polynomial().substitutePower(2);
    final Polynomial<Z> theta = theta();
    final Polynomial<Z> pi = pi().shift(1);
    final Polynomial<Z> piSquared = RING.multiply(pi, pi, mN + 2);
    final Polynomial<Z> a = RING.divide(RING.add(piSquared, pi.substitutePower(2)).shift(-2), Z.TWO);
    return RING.add(RING.subtract(theta, a), t2);
  }

  @Override
  public Z next() {
    super.next();
    if (++mN <= 1) {
      return Z.ONE;
    }
    //System.out.println(alpha());
    return alpha().coeff(mN);
  }
}
