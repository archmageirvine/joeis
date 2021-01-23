package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026015 a(n) = number of (s(0), s(1), ..., s(2n)) such that s(i) is a nonnegative integer and |s(i) - s(i-1)| = 1 for i = 1,2,...,n, s(0) = 2, s(2n) = 8. Also a(n) = T(2n,n-3), where T is the array defined in A026009.
 * @author Sean A. Irvine
 */
public class A026015 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 3).subtract(Binomial.binomial(2 * mN, mN - 6));
  }
}

