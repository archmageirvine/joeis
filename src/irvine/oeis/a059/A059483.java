package irvine.oeis.a059;

import java.util.Arrays;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059483 Triangle T(n,k) = number of fixed 2 X n polyominoes with k cells = coefficient of x^n*y^k in (1+x*y)/(1-x*y-x*y^2-x^2*y^3)-1, read by rows in order 00, 10, 01, 20, 11, 02, ...
 * @author Sean A. Irvine
 */
public class A059483 implements Sequence {

  private static final PolynomialRingField<Q> INNER = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(INNER);
  private static final Polynomial<Polynomial<Q>> NUM = RING.create(Arrays.asList(INNER.one(), INNER.x()));
  private static final Polynomial<Polynomial<Q>> DEN = RING.create(Arrays.asList(INNER.one(), Polynomial.create(Q.ZERO, Q.NEG_ONE, Q.NEG_ONE), Polynomial.create(Q.ZERO, Q.ZERO, Q.ZERO, Q.NEG_ONE)));
  private Polynomial<Polynomial<Q>> mGf;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, mN + 1);
      final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
      if (++mN == 0) {
        mGf = ring.zero();
      } else {
        mGf = ring.series(NUM, DEN, mN);
      }
      mM = 0;
    }
    return mGf.coeff(mN - mM).coeff(mM).toZ();
  }
}
