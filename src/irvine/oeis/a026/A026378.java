package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026378 a(n) = number of integer strings s(0),...,s(n) counted by array T in A026374 that have s(n)=1; also a(n) = T(2n-1,n-1).
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
