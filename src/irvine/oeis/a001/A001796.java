package irvine.oeis.a001;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001796 Coefficients of Legendre polynomials.
 * @author Sean A. Irvine
 */
public class A001796 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> POLY = RING.create(Arrays.asList(Q.ZERO, Q.FOUR));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> c = RING.multiply(RING.shift(RING.subtract(RING.one(), RING.sqrt1m(POLY, mN + 1)), -1), Q.HALF);
    final Polynomial<Q> c3 = RING.pow(c, 3, mN + 1);
    final Polynomial<Q> s = RING.sqrt(c3, mN);
    return s.coeff(mN).num();
  }
}
