package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026378 <code>a(n) =</code> number of integer strings <code>s(0),...,s(n)</code> counted by array T in <code>A026374</code> that have <code>s(n)=1;</code> also <code>a(n) = T(2n-1,n-1)</code>.
 * @author Sean A. Irvine
 */
public class A026378 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Binomial.binomial(2 * k + 1, k + 1)));
    }
    return sum;
  }
}
