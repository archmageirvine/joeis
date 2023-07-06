package irvine.oeis.a033;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000108;

/**
 * A033552 Number of partitions into Catalan numbers.
 * @author Sean A. Irvine
 */
public class A033552 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> den = RING.one();
    final Sequence catalan = new A000108().skip(1);
    int c;
    while ((c = catalan.next().intValueExact()) <= mN) {
      den = RING.multiply(den, RING.oneMinusXToTheN(c), mN + 1);
    }
    return RING.coeff(RING.one(), den, mN);
  }
}
