package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006155 Expansion of e.g.f.: 1/(2-x-exp(x)).
 * @author Sean A. Irvine
 */
public class A006155 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006155(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006155() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.TWO, Q.NEG_ONE));
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.coeff(RING.one(), RING.subtract(C, RING.exp(RING.x(), mN)), mN).multiply(mF).toZ();
  }
}

