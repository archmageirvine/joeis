package irvine.oeis.a138;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A138108 A triangular sequence of coefficients based on the expansion of an Hamiltonian resolvent or Green's function: p(x,t)=Exp[x*t]/(x-t); where t is taken as the Hamiltonian variable and x as the complex variable.
 * @author Sean A. Irvine
 */
public class A138108 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private Polynomial<Polynomial<Q>> mGf = new PolynomialRingField<>(new PolynomialRingField<>(Rationals.SINGLETON)).one();

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
      final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>(Rationals.SINGLETON, 2 * mN);
      final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
      mGf = ring.series(PolynomialUtils.innerShift(ring, ring.exp(ring.monomial(inner.x(), 1), mN), mN + 1), ring.create(Arrays.asList(inner.x(), Polynomial.create(Q.NEG_ONE))), mN);
    }
    return mGf.coeff(mN).coeff(mM).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
