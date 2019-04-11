package irvine.oeis.a013;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013308 Numerator of <code>[x^n]</code> of the Taylor series arccosh(exp(x)-arctan(x))= <code>x+x^2/2 -x^3/8 -17*x^4/80 +109*x^5/1920 +299*x^6/2304 -813*x^7/25600 -..</code>.
 * @author Sean A. Irvine
 */
public class A013308 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return select(new Q(mN));
    }
    final Polynomial<Q> egf = RING.acosh(RING.subtract(RING.exp(RING.x(), mN + 1), RING.atan(RING.x(), mN + 1)), mN);
    //System.out.println(egf);
    return select(egf.coeff(mN));
  }
}
