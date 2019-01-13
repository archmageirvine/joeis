package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;

/**
 * A007279.
 * @author Sean A. Irvine
 */
public class A007279 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> den = RING.one();
    final A000041 part = new A000041();
    part.next(); // skip 0th term
    int p;
    while ((p = part.next().intValueExact()) <= mN) {
      den = RING.multiply(den, RING.oneMinusXToTheN(p), mN);
    }
    return RING.coeff(RING.one(), den, mN);
  }
}
