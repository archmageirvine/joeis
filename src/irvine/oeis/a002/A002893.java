package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002893 <code>a(n) =</code> Sum_{k=0..n} binomial(n,k)^2 * binomial(2*k,k).
 * @author Sean A. Irvine
 */
public class A002893 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).square().multiply(Binomial.binomial(2 * k, k)));
    }
    return sum;
  }
}
