package irvine.oeis.a265;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A265388 a(n) = gcd{k=1..n-1} binomial(2*n, 2*k), a(1) = 0.
 * @author Sean A. Irvine
 */
public class A265388 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    Z g = Z.ZERO;
    for (long k = 1; k < mN && !g.isOne(); ++k) {
      g = Functions.GCD.z(g, Binomial.binomial(2 * mN, 2 * k));
    }
    return g;
  }
}
