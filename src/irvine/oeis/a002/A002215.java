package irvine.oeis.a002;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002215 Number of polyhexes with n hexagons, having reflectional symmetry (see Harary and Read for precise definition).
 * @author Sean A. Irvine
 */
public class A002215 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002215(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002215() {
    super(1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO_X = RING.create(Arrays.asList(Q.ZERO, Q.TWO));
  private static final Polynomial<Q> A = RING.create(Arrays.asList(Q.ONE, new Q(-3)));
  private static final Polynomial<Q> B = RING.create(Arrays.asList(Q.ZERO, new Q(-6), Q.FIVE));
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ONE, Q.TWO));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> s = RING.subtract(A, RING.sqrt1p(B, mN));
    final Polynomial<Q> u = RING.series(s, TWO_X, mN);
    final Polynomial<Q> u2 = RING.multiply(u.substitutePower(2, mN), C, mN);
    final Polynomial<Q> gf = RING.add(RING.x(), u2);
    return gf.coeff(mN).toZ();
  }
}
