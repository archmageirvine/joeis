package irvine.oeis.a033;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033720 Product <code>theta3(q^d); d | 8</code>.
 * @author Sean A. Irvine
 */
public class A033720 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  protected int base() {
    return 8;
  }

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= base(); ++k) {
      if (base() % k == 0) {
        prod = RING.multiply(prod, ThetaFunctions.theta3z(mN / k).substitutePower(k), mN);
      }
    }
    return prod.coeff(mN);
  }
}
