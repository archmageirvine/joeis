package irvine.oeis.a003;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A003240 Number of partially achiral rooted trees.
 * @author Sean A. Irvine
 */
public class A003240 extends A003237 {

  private int mN = 0;

  {
    setOffset(1);
    super.next();
  }

  protected Polynomial<Z> theta() {
    final Polynomial<Z> t2 = polynomial().substitutePower(2, mN + 1);
    final Polynomial<Z> pi = pi().shift(1);
    final Polynomial<Z> piSquared = RING.multiply(pi, pi, mN + 1);
    final Polynomial<Z> a = RING.subtract(piSquared, pi.substitutePower(2, mN + 1)).shift(-1);
    final Polynomial<Z> b = RING.multiply(RING.add(pi, RING.x()), Z.TWO);
    return RING.divide(RING.multiply(t2, RING.add(a, b)).shift(-2), Z.TWO);
  }

  @Override
  public Z next() {
    super.next();
    if (++mN == 1) {
      return Z.ONE;
    }
    return theta().coeff(mN);
  }
}
