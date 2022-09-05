package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A058892 E.g.f.: exp(f(x)-1), where f(x) = o.g.f. for partitions (A000041), Product_{k&gt;=1} 1/(1-x^k).
 * @author Sean A. Irvine
 */
public class A058892 extends A000041 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      super.next();
      mA.add(Q.ZERO);
    } else {
      mF = mF.multiply(mN);
      mA.add(new Q(super.next()));
    }
    return RING.exp(mA, mN).coeff(mN).multiply(mF).toZ();
  }
}
