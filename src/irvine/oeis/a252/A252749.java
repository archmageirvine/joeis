package irvine.oeis.a252;
// manually partsum at 2021-09-28

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;

/**
 * A252749 Partial sums of A252748: a(0) = 0, a(n) = A252748(n) + a(n-1).
 * @author Georg Fischer
 */
public class A252749 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A252749() {
    super(new A252748());
  }

  @Override
  public Z next() {
    ++mN;
    return mN <= 0 ? Z.ZERO : super.next();
  }
}
