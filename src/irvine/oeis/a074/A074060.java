package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A074060 Graded dimension of the cohomology ring of the moduli space of n-pointed stable curves of genus 0 satisfying the associativity equations of physics (also known as the WDVV equations).
 * @author Sean A. Irvine
 */
public class A074060 extends Sequence3 {

  // After Eric Rains

  private static final PolynomialRingField<Q> INNER = new PolynomialRingField<>("t", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>("u", INNER);
  private static final Polynomial<Q> X1 = Polynomial.create(Q.ONE, Q.ONE);
  private int mN = 1;
  private int mM = 0;
  private Polynomial<Polynomial<Q>> mF = RING.monomial(Polynomial.create(Q.HALF), 2);

  private Polynomial<Polynomial<Q>> da(final Polynomial<Polynomial<Q>> a, final int n) {
    final Polynomial<Polynomial<Q>> daNum = RING.add(RING.multiply(a, X1), RING.x());
    final Polynomial<Polynomial<Q>> daDen = RING.subtract(RING.one(), RING.multiply(a, INNER.x()));
    return RING.series(daNum, daDen, n);
  }

  @Override
  public Z next() {
    if (++mM + 1 >= mN) {
      ++mN;
      mM = 0;
      mF = RING.integrate(da(mF, mN));
    }
    return mF.coeff(mN).coeff(mM).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
