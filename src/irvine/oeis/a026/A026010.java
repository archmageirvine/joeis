package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026010 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(n))</code> such that <code>s(i)</code> is a nonnegative integer and <code>|s(i) - s(i-1)| = 1</code> for i <code>= 1,2,...,n</code> and <code>s(0) = 2</code>. Also <code>a(n) =</code> sum of numbers in row <code>n+1</code> of array T defined in <code>A026009</code>.
 * @author Sean A. Irvine
 */
public class A026010 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial((mN + k) / 2, k / 2));
    }
    return sum;
  }
}

