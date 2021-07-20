package irvine.oeis.a001;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001473 Number of degree-n permutations of order exactly 4.
 * @author Sean A. Irvine
 */
public class A001473 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> POLYA = RING.create(Arrays.asList(Q.ZERO, Q.ONE, Q.HALF));
  private static final Polynomial<Q> POLYB = RING.create(Arrays.asList(Q.ZERO, Q.ONE, Q.HALF, Q.ZERO, Q.ONE_QUARTER));

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    final Polynomial<Q> s = RING.exp(POLYA, mN);
    final Polynomial<Q> t = RING.exp(POLYB, mN);
    return t.coeff(mN).subtract(s.coeff(mN)).multiply(mF).toZ();
  }
}

