package irvine.oeis.a058;
// manually partsum at 2021-09-27 19:03

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000084;

/**
 * A058351 Partial sums of A000084.
 * @author Georg Fischer
 */
public class A058351 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A058351() {
    super(new A000084());
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : super.next();
  }
}
