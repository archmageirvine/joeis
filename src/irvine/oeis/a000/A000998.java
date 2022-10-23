package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000998 From a differential equation.
 * @author Sean A. Irvine
 */
public class A000998 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Polynomial<Z>> mProducts = new ArrayList<>();
  {
    mProducts.add(RING.one());
  }
  private int mN = -1;

  private Polynomial<Z> prod(final int k) {
    while (k >= mProducts.size()) {
      final long s = mProducts.size();
      final Polynomial<Z> t = Polynomial.create(1, -3 * s, 3 * s * s, -s * s * s);
      mProducts.add(RING.multiply(mProducts.get(mProducts.size() - 1), t));
    }
    return mProducts.get(k);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z c = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      c = c.add(RING.coeff(RING.monomial(Z.ONE, 3 * k - 3), prod(k), mN));
    }
    return c;
  }
}

