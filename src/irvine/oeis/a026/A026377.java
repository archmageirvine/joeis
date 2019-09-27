package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026377 <code>a(n) =</code> number of integer strings <code>s(0),...,s(n)</code> counted by array T in <code>A026374</code> that have <code>s(n)=4</code>; also <code>a(n) = T(2n,n-2)</code>.
 * @author Sean A. Irvine
 */
public class A026377 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Binomial.binomial(2 * k, k + 2)));
    }
    return sum;
  }
}
