package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A061846 Number of nonisomorphic circulant self-complementary undirected p^2-graphs, indexed by odd primes p.
 * @author Sean A. Irvine
 */
public class A061846 extends A065091 {

  {
    setOffset(3);
  }

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum1 = Z.ZERO;
    Z sum2 = Z.ZERO;
    final int s = (p - 1) / 2;
    for (final Z rr : Jaguar.factor(s).divisors()) {
      if (rr.isEven()) {
        final int r = rr.intValue();
        final int q = s / r;
        final Z phi = Functions.PHI.z(r);
        sum1 = sum1.add(phi.multiply(Z.ONE.shiftLeft((long) (p + 1) * q).subtract(Z.ONE.shiftLeft(2 * q))));
        sum2 = sum2.add(phi.shiftLeft(q));
      }
    }
    sum1 = sum1.divide(p).divide(s);
    sum2 = sum2.divide(s).square();
    return sum1.add(sum2);
  }
}
