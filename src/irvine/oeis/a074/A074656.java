package irvine.oeis.a074;
// manually seqop at 2023-06-02 22:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a029.A029809;

/**
 * A074656 Number of Lyndon words (aperiodic necklaces) with 4n beads of 4 colors, n beads of each color.
 * @author Georg Fischer
 */
public class A074656 extends AbstractSequence {

  private int mN = -1;
  private final A029809 mSeq = new A029809();

  /** Construct the sequence. */
  public A074656() {
    super(0);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return mSeq.next().multiply(6);
  }
}
