package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A006318 Large Schr\u00f6der numbers (or large Schroeder numbers, or big Schroeder numbers).
 * @author Sean A. Irvine
 */
public class A006318 extends AbstractSequence implements DirectSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A006318(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A006318() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(Binomial.binomial(n, k - 1)).shiftLeft(k));
    }
    return sum.divide(n);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}

