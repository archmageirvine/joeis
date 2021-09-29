package irvine.oeis.a144;
// manually partsum at 2021-09-28

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a037.A037032;

/**
 * A144120 Number of prime parts in the last section of the set of partitions of n.
 * @author Georg Fischer
 */
public class A144120 extends DifferenceSequence {

  protected long mN = 0;

  /** Construct the sequence. */
  public A144120() {
    super(new A037032());
  }

  @Override
  public Z next() {
    ++mN;
    return mN <= 1 ? Z.ZERO : super.next();
  }
}
