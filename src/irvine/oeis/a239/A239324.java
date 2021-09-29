package irvine.oeis.a239;
// manually partsum at 2021-09-28

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a090.A090431;

/**
 * A239324 Partial sums of A090431.
 * @author Georg Fischer
 */
public class A239324 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A239324() {
    super(new A090431());
  }

  @Override
  public Z next() {
    ++mN;
    return mN <= 0 ? Z.ZERO : super.next();
  }
}
