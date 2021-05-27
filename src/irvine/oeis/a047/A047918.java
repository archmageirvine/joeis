package irvine.oeis.a047;

import irvine.factor.factor.Cheetah;
import irvine.math.Mobius;
import irvine.math.z.Z;

/**
 * A047918 Triangular array read by rows: a(n,k) = Sum_{d|k} mu(d)*U(n,k/d) if k|n else 0, where U(n,k) = A047916(n,k) (1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A047918 extends A047916 {

  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    if (mN % mM != 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mM).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(t(mN, mM / d).multiply(Mobius.mobius(d)));
    }
    return sum;
  }
}
