package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A026014 a(n) = number of (s(0), s(1), ..., s(2n)) such that s(i) is a nonnegative integer and |s(i) - s(i-1)| = 1 for i = 1,2,...,n, s(0) = 2, s(2n) = 6. Also a(n) = T(2n,n-2), where T is the array defined in A026009.
 * @author Sean A. Irvine
 */
public class A026014 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN - 2).subtract(Binomial.binomial(2 * mN, mN - 5));
  }
}

