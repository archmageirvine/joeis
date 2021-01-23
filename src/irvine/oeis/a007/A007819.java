package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007819 a(n) = Sum_{j=1..n} binomial(n^2, j).
 * @author Sean A. Irvine
 */
public class A007819 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long n2 = mN * mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(n2, k));
    }
    return sum;
  }
}
