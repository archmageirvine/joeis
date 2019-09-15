package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026014 <code>a(n) =</code> number of <code>(s(0), s(1)</code>, ..., <code>s(2n))</code> such that <code>s(i)</code> is a nonnegative integer and <code>|s(i) - s(i-1)| = 1</code> for i <code>= 1,2,...,n, s(0) = 2, s(2n) = 6</code>. Also <code>a(n) = T(2n,n-2)</code>, where T is the array defined in <code>A026009</code>.
 * @author Sean A. Irvine
 */
public class A026014 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 2).subtract(Binomial.binomial(2 * mN, mN - 5));
  }
}

