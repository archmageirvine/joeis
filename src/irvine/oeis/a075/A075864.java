package irvine.oeis.a075;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075864 G.f. satisfies A(x) = 1 + Sum_{n&gt;=0} (x*A(x))^(2^n).
 * @author Sean A. Irvine
 */
public class A075864 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Polynomial<Z> ax = mA.shift(1);
      Polynomial<Z> sum = RING.one();
      for (long k = 1; k <= mN; k *= 2) {
        sum = RING.add(sum, RING.pow(ax, k, mN));
      }
      mA = sum;
    }
    return mA.coeff(mN);
  }
}

