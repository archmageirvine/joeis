package irvine.oeis.a039;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039828 Largest coefficient in expansion of Product_{i=1..n} (1 + (-q)^i).
 * @author Sean A. Irvine
 */
public class A039828 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mProduct = RING.one();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mProduct = RING.multiply(mProduct, (mN & 1) == 0 ? RING.onePlusXToTheN(mN) : RING.oneMinusXToTheN(mN));
    Z max = Z.ZERO;
    for (final Z v : mProduct) {
      max = max.max(v);
    }
    return max;
  }
}
