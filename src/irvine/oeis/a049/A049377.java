package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A049377 Row sums of triangle A049352.
 * @author Sean A. Irvine
 */
public class A049377 extends AbstractSequence {

  private final A049352 mSeq1 = new A049352();

  /** Construct the sequence. */
  public A049377() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(mSeq1.next());
    }
    return sum;
  }
}
