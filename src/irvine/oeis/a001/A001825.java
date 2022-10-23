package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001825 Central factorial numbers.
 * @author Sean A. Irvine
 */
public class A001825 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private long mN = 2;

  @Override
  public Z next() {
    mN += 2;
    Polynomial<Z> p = RING.one();
    for (long k = 1; k <= mN; ++k) {
      p = RING.multiply(p, Polynomial.create(2 * k - mN - 1, 1), 4);
    }
    return p.coeff(4).abs();
  }
}
