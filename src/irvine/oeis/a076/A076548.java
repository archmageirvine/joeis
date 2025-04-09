package irvine.oeis.a076;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076548 Let P(n,x) be defined as follows: P(1,x)=x, P(n,x)=P(n-1,x)^2+1, sequence gives maximum value of coefficients of P(n,x).
 * @author Sean A. Irvine
 */
public class A076548 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = RING.x();
      return Z.ONE;
    }
    mA = RING.add(RING.multiply(mA, mA), RING.one());
    Z max = Z.ZERO;
    for (final Z v : mA) {
      max = max.max(v);
    }
    return max;
  }
}
