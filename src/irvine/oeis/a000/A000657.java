package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000657 Median Euler numbers (the middle numbers of Arnold's shuttle triangle).
 * @author Sean A. Irvine
 */
public class A000657 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> den = RING.zero();
    for (int k = mN; k > 0; --k) {
      den = RING.series(Polynomial.create(0, ((k + 1) / 2) * (2L * k - 1)), RING.subtract(RING.one(), den), mN);
    }
    //    System.out.println("D=" + den);
    return RING.coeff(RING.one(), RING.subtract(RING.one(), den), mN);
  }
}
