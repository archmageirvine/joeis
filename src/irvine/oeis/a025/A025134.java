package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025134 a(n) = n-th elementary symmetric function of C(n,0), C(n,1), ..., C(n,n).
 * @author Sean A. Irvine
 */
public class A025134 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A025134(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A025134() {
    super(0);
  }

  private long mN = -1;

  protected Z sym(final Z prod, final long a, final long max, final long upper, final long n) {
    if (n == 0) {
      return prod;
    }
    Z sum = Z.ZERO;
    for (long b = a; b <= max; ++b) {
      sum = sum.add(sym(prod.multiply(Binomial.binomial(upper, b)), b + 1, max, upper, n - 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    return sym(Z.ONE, 0, ++mN, mN, mN);
  }
}
