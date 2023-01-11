package irvine.oeis.a039;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039909 Largest coefficient in expansion of Product_{i=1..n} (1-q^1+q^2-...+(-q)^i).
 * @author Sean A. Irvine
 */
public class A039909 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mProduct = RING.one();
  private final Polynomial<Z> mT = RING.empty();
  {
    mT.add(Z.ONE);
  }
  private int mN = 0;

  @Override
  public Z next() {
    mT.add((++mN & 1) == 0 ? Z.ONE : Z.NEG_ONE);
    mProduct = RING.multiply(mProduct, mT);
    Z max = Z.ZERO;
    for (final Z v : mProduct) {
      max = max.max(v);
    }
    return max;
  }
}
