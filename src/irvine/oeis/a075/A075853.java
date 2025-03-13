package irvine.oeis.a075;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075853 G.f. satisfies A(x) = 1 + x (1+Sum_{n=0..inf} [xA(x)]^(2^n)).
 * @author Sean A. Irvine
 */
public class A075853 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Polynomial<Z> ax = mA.shift(1);
      Polynomial<Z> sum = RING.one();
      for (long k = 1; k <= mN; k *= 2) {
        sum = RING.add(sum, RING.pow(ax, k, mN - 1));
      }
      mA = RING.add(RING.one(), sum.shift(1));
    }
    return mA.coeff(mN);
  }
}

