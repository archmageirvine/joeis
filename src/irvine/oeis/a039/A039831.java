package irvine.oeis.a039;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039831 Largest coefficient in expansion of Product (1+q^1+q^3...+q^(2i-1)), i=1 to n.
 * @author Sean A. Irvine
 */
public class A039831 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mProduct = RING.one();
  private final Polynomial<Z> mT = RING.empty();
  {
    mT.add(Z.ONE);
  }

  @Override
  public Z next() {
    mT.add(Z.ONE);
    mT.add(Z.ZERO);
    mProduct = RING.multiply(mProduct, mT);
    Z max = Z.ZERO;
    for (final Z v : mProduct) {
      max = max.max(v);
    }
    return max;
  }
}
