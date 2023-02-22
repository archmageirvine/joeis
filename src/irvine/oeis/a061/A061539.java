package irvine.oeis.a061;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061539 Number of signed permutations in B_n which correspond to smooth Schubert varieties. These permutations avoid the following patterns: (-2 -1) (1 2 -3) (1 -2 -3) (-1 2 -3) (2 -1 -3) (-2 1 -3) (3 -2 1) (2 -4 3 1) (-2 -4 3 1) (3412) (3 4 -1 2) (-3 4 1 2) (4 1 3 -2) (4 -1 3 -2) (4 2 3 1) (4 2 3 -1) (-4 2 3 1).
 * @author Sean A. Irvine
 */
public class A061539 extends Sequence0 {

  // G.f: ((1-5*x+5*x^2)*(1-x)+(2*x-x^2)*(1-x)*sqrt(1-4*x))/(1-6*x+8*x^2-4*x^3).

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM1 = RING.multiply(Polynomial.create(Q.ONE, new Q(-5), Q.FIVE), RING.oneMinusXToTheN(1));
  private static final Polynomial<Q> NUM2 = RING.multiply(Polynomial.create(Q.ZERO, Q.TWO, Q.NEG_ONE), RING.oneMinusXToTheN(1));
  private static final Polynomial<Q> C1 = RING.monomial(Q.FOUR, 1);
  private static final Polynomial<Q> DEN = Polynomial.create(Q.ONE, new Q(-6), Q.EIGHT, new Q(-4));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(RING.add(RING.multiply(RING.sqrt1m(C1, mN), NUM2, mN), NUM1), DEN, mN).toZ();
  }
}
