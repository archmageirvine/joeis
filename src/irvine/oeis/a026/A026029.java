package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026029 Number of (s(0), s(1), ..., s(2n)) such that s(i) is a nonnegative integer and |s(i) - s(i-1)| = 1 for i = 1,2,....,n, s(0) = 3, s(2n) = 3. Also T(2n,n), where T is defined in A026022.
 * @author Sean A. Irvine
 */
public class A026029 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(2 * ++mN, mN).subtract(Binomial.binomial(2 * mN, mN - 4));
  }
}

