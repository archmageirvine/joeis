package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002206 Numerators of logarithmic numbers (also of Gregory coefficients G(n)).
 * @author Sean A. Irvine
 */
public class A002206 extends AbstractSequence {

  /** Construct the sequence. */
  public A002206() {
    super(-1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(RING.x(), RING.log1p(RING.x(), mN + 1), mN).num();
  }
}
