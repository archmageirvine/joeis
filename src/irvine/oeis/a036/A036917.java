package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A036917 a(n) = (16*(n-1/2)*(2*n^2-2*n+1)*a(n-1)-256*(n-1)^3*a(n-2))/n^3.
 * @author Sean A. Irvine
 */
public class A036917 extends AbstractSequence {

  /** Construct the sequence. */
  public A036917() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(2 * mN - 2 * k, mN - k).square().multiply(Binomial.binomial(2 * k, k).square()));
    }
    return sum;
  }
}
