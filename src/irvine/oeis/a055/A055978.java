package irvine.oeis.a055;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A055978 A sequence related to Ramanujan's tau function.
 * @author Sean A. Irvine
 */
public class A055978 extends AbstractSequence {

  /** Construct the sequence. */
  public A055978() {
    super(4);
  }

  // After Michael Somos

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final long[] cc = new long[mN + 1];
    for (int k = 1; k * k < cc.length; ++k) {
      cc[k * k] = k * (long) k;
    }
    final Polynomial<Z> c = Polynomial.create(cc);
    return RING.coeff(RING.multiply(RING.multiply(RING.pow(eta, 2, mN), RING.pow(eta.substitutePower(4, mN), 18, mN), mN), c, mN), eta.substitutePower(2, mN), mN);
  }
}
