package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026026 a(n) = number of (s(0), s(1), ..., s(2n-1)) such that s(i) is a nonnegative integer and |s(i) - s(i-1)| = 1 for i = 1,2,...,n, s(0) = 3, s(2n-1) = 4. Also a(n) = T(2n-1,n-1), where T is defined in A026022.
 * @author Sean A. Irvine
 */
public class A026026 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN - 1, mN - 1).subtract(Binomial.binomial(2 * mN - 1, mN - 5));
  }
}

