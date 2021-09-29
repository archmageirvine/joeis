package irvine.oeis.a080;
// manually partsum at 2021-09-27 19:03

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a007.A007001;

/**
 * A080336 Partial sums of A007001.
 * @author Georg Fischer
 */
public class A080336 extends PartialSumSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A080336() {
    super(new A007001());
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : super.next();
  }
}
