package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026029 Number of <code>(s(0), s(1)</code>, ..., <code>s(2n))</code> such that <code>s(i)</code> is a nonnegative integer and <code>|s(i) - s(i-1)| = 1</code> for i <code>= 1,2,....,n, s(0) = 3, s(2n) = 3</code>. Also <code>T(2n,n)</code>, where T is defined in <code>A026022</code>.
 * @author Sean A. Irvine
 */
public class A026029 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).subtract(Binomial.binomial(2 * mN, mN - 4));
  }
}

