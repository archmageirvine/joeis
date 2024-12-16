package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073616 a(n) = Sum_{k=0..n} lpf(binomial(n, k)), where lpf(m) is the least prime factor of m.
 * @author Sean A. Irvine
 */
public class A073616 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.LPF.z(Binomial.binomial(mN, k)));
    }
    return sum;
  }
}
