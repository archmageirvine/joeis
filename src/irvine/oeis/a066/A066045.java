package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066045 Triangle T(n,k) defined by Sum_{1&lt;=k&lt;=n} T(n,k)*u^k*t^n/n! = exp(((1-t)*(1-t^2)*(1-t^3)...)^(-u)-1).
 * @author Sean A. Irvine
 */
public class A066045 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Polynomial<Polynomial<Q>> mGf = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("u", Rationals.SINGLETON, mN);
      final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>("t", inner);
      Polynomial<Polynomial<Q>> prod = ring.one();
      for (int k = 1; k <= mN; ++k) {
        prod = ring.multiply(prod, ring.oneMinusXToTheN(k), mN);
      }
      final Polynomial<Polynomial<Q>> z = ring.exp(ring.multiply(ring.log(prod, mN), inner.negate(inner.x())), mN);
      mGf = ring.exp(ring.subtract(z, ring.one()), mN);
      mM = 1;
    }
    return mGf.coeff(mN).coeff(mM).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
