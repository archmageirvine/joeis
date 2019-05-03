package irvine.oeis.a002;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Elliptic;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002908 High temperature expansion of <code>-u/J</code> in odd powers of v <code>= tanh(J/kT)</code>, where u is energy per site of the <code>spin-1/2</code> Ising model on square lattice with nearest-neighbor interaction J at temperature T.
 * @author Sean A. Irvine
 */
public class A002908 implements Sequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.multiply(RING.monomial(new Q(4), 1), RING.oneMinusXToTheN(2));
  private static final Polynomial<Q> C2 = RING.onePlusXToTheN(2);
  private static final Polynomial<Q> DEN = RING.pow(C2, 2);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.ONE, Q.ZERO, new Q(-6), Q.ZERO, Q.ONE));
  private int mN = 0;

  private Polynomial<Q> getU(final int n) {
    final Polynomial<Q> z = RING.series(NUM, DEN, n);
    final Polynomial<Q> ek = Elliptic.ellipticK(z, n);
    // ek = (2/Pi)*EllipticK(4*v*(1-v^2)/(1+v^2)^2)
    // e = (1+v^2)*(1 - (1-6*v^2+v^4) * (2/Pi)*EllipticK(4*v*(1-v^2)/(1+v^2)^2) / (1+v^2)^2)
    return RING.multiply(RING.multiply(C2, RING.subtract(RING.one(), RING.series(RING.multiply(C1, ek, n), DEN, n)), n), Q.HALF);
  }

  @Override
  public Z next() {
    mN += 2;
    return getU(mN).coeff(mN).toZ();
  }

}

