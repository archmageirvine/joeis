package irvine.oeis.a068;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000009;

/**
 * A068006 Number of partitions of n into distinct partition numbers.
 * @author Sean A. Irvine
 */
public class A068006 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final Sequence part = new A000009().skip();
    ++mN;
    Polynomial<Z> gf = RING.one();
    int p;
    while ((p = part.next().intValueExact()) <= mN) {
      gf = RING.multiply(gf, RING.oneMinusXToTheN(p), mN);
    }
    return RING.coeff(RING.one(), gf, mN);
  }
}
