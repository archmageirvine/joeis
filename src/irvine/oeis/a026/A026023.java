package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026023 a(n) = number of (s(0), s(1), ..., s(n)) such that s(i) is a nonnegative integer and |s(i) - s(i-1)| = 1 for i = 1,2,...,n and s(0) = 3. Also a(n) = Sum{T(n,k), k = 0,1,...,[ (n+3)/2 ]}, where T is defined in A026022.
 * @author Sean A. Irvine
 */
public class A026023 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z a = Binomial.binomial((mN / 2) * 2 + 2, mN / 2);
    return (mN & 1) == 0 ? a : a.multiply2();
  }
}

