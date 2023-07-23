package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A064309 Row sums of triangle A064308.
 * @author Sean A. Irvine
 */
public class A064309 extends AbstractSequence {

  private final A064308 mSeq1 = new A064308();

  /** Construct the sequence. */
  public A064309() {
    super(0);
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(mSeq1.next());
    }
    return sum;
  }
}
