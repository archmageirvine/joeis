package irvine.oeis.a076;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076534 Let P(n,x) be defined by P(1,x)=P(2,x)=x, P(n,x)=P(n-1,x)*P(n-2,x)+1; then a(n) is the maximum element among coefficients of P(n,x) of degree F(n) (where F(n) denotes the n-th Fibonacci number).
 * @author Sean A. Irvine
 */
public class A076534 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = null;
  private Polynomial<Z> mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = RING.x();
      } else {
        mB = RING.x();
      }
      return Z.ONE;
    }
    final Polynomial<Z> t = RING.add(RING.multiply(mA, mB), RING.one());
    mA = mB;
    mB = t;
    Z max = Z.ZERO;
    for (final Z v : t) {
      max = max.max(v);
    }
    return max;
  }
}
