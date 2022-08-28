package irvine.oeis.a058;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058810 The sequence lambda(n,n), where lambda is defined in A055203.
 * @author Sean A. Irvine
 */
public class A058810 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Binomial.binomial(mN, k).multiply(Binomial.binomial(k, 2).pow(mN)));
    }
    return sum;
  }
}
