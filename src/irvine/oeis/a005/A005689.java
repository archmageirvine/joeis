package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005689 Number of Twopins positions.
 * @author Sean A. Irvine
 */
public class A005689 extends AbstractSequence {

  /** Construct the sequence. */
  public A005689() {
    super(6);
  }

  private int mN = 4;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 6; ++k) {
      sum = sum.add(Binomial.binomial(mN - 4 * k, 2 * k));
    }
    return sum;
  }
}
