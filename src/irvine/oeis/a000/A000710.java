package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000710 Number of partitions of <code>n,</code> with two kinds of <code>1, 2, 3</code> and 4.
 * @author Sean A. Irvine
 */
public class A000710 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -1, -1, 0, 0, 2, 0, 0, -1, -1, 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> den = DEN;
    for (int k = 1; k <= mN; ++k) {
      den = RING.multiply(den, RING.oneMinusXToTheN(k), mN);
    }
    return RING.coeff(RING.one(), den, mN);
  }
}
