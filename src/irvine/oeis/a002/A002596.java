package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002596 Numerators in expansion of sqrt(1+x). Absolute values give numerators in expansion of sqrt(1-x).
 * @author Sean A. Irvine
 */
public class A002596 extends AbstractSequence {

  /* Construct the sequence. */
  public A002596() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.sqrt1p(RING.x(), mN).coeff(mN).num();
  }
}
