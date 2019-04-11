package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000630 Number of ways to represent n using the binary operator <code>a * b = 2^a + b</code>.
 * @author Sean A. Irvine
 */
public class A000630 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private Polynomial<Z> mDen = RING.one();

  @Override
  public Z next() {
    if (++mN > mDen.degree()) {
      throw new UnsupportedOperationException();
    }
    final Z r = RING.coeff(RING.one(), mDen.truncate(mN), mN);
    // Constant below cannot exceed 31, bigger values use more
    // memory, but support more terms
    if (mN < 20) {
      mDen = RING.subtract(mDen, RING.monomial(r, 1 << mN));
    }
    return r;
  }
}

