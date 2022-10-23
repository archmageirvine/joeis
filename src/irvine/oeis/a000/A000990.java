package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000990 Number of plane partitions of n with at most two rows.
 * @author Sean A. Irvine
 */
public class A000990 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = Polynomial.create(1, -1);
    for (int m = 2; m <= mN; ++m) {
      final Polynomial<Z> p = RING.oneMinusXToTheN(m);
      prod = RING.multiply(prod, RING.multiply(p, p, mN), mN);
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}

