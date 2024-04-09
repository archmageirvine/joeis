package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A036917 G.f.: (4/Pi^2)*EllipticK(4*x^(1/2))^2.
 * @author Sean A. Irvine
 */
public class A036917 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A036917(final int offset) {
    super(offset);
  }

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
