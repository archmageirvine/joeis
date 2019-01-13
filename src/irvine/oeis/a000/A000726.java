package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000726.
 * @author Sean A. Irvine
 */
public class A000726 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= mN; ++k) {
      final long[] v = new long[2 * k + 1];
      v[0] = 1;
      v[k] = 1;
      v[2 * k] = 1;
      p = RING.multiply(p, Polynomial.create(v), mN);
    }
    return p.coeff(mN);
  }
}
