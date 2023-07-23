package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A049056 Number of minimal ordered covers of a labeled n-set.
 * @author Sean A. Irvine
 */
public class A049056 extends AbstractSequence {

  private final A049055 mSeq1 = new A049055();

  /** Construct the sequence. */
  public A049056() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(mSeq1.next());
    }
    return sum;
  }
}
