package irvine.oeis.a121;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A121357 Number of different, not necessarily connected, labeled trivalent diagrams of size n.
 * @author Sean A. Irvine
 */
public class A121357 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A121357(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A121357() {
    super(0);
  }

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C2 = RING.create(Arrays.asList(Q.ZERO, Q.ONE, Q.HALF));
  private static final Polynomial<Q> C3 = RING.create(Arrays.asList(Q.ZERO, Q.ONE, Q.ZERO, Q.ONE_THIRD));
  protected int mN = -1;
  protected Z mF = Z.ONE;

  protected Q nextQ() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> exs2 = RING.exp(C2, mN);
    final Polynomial<Q> exs3 = RING.exp(C3, mN);
    return exs2.coeff(mN).multiply(exs3.coeff(mN)).multiply(mF);
  }

  @Override
  public Z next() {
    return nextQ().multiply(mF).toZ();
  }
}
