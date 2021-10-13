package irvine.oeis.a051;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051862 Perturbation expansion in quantum field theory: scalar case in 6 spacetime dimensions.
 * @author Sean A. Irvine
 */
public class A051862 implements Sequence {

  // After F. Chapoton

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> THREE = RING.monomial(Q.THREE, 0);
  private static final Polynomial<Q> THREE_X = THREE.shift(1);
  private static final Polynomial<Q> T12 = RING.create(Arrays.asList(Q.ZERO, new Q(-12)));
  private Polynomial<Q> mC = RING.create(Arrays.asList(Q.ZERO, Q.HALF.negate()));
  private int mN = -1;

  private Polynomial<Q> shadok(final Polynomial<Q> c, final int n) {
    final Polynomial<Q> a = RING.subtract(RING.subtract(RING.multiply(RING.diff(c).shift(1), Q.TWO), c), THREE);
    final Polynomial<Q> aa = RING.multiply(c, a, n);
    final Polynomial<Q> b = RING.subtract(RING.subtract(RING.multiply(RING.diff(aa).shift(1), Q.TWO), aa), RING.multiply(a, Q.TWO));
    final Polynomial<Q> bb = RING.multiply(c, b, n);
    final Polynomial<Q> cc = RING.subtract(RING.subtract(RING.multiply(RING.diff(bb).shift(1), Q.TWO), bb), b);
    return RING.series(THREE_X, cc, n);
  }

  @Override
  public Z next() {
    mC = shadok(mC, ++mN);
    return RING.substitute(mC, T12, mN).coeff(mN).divide(6).toZ();
  }
}
