package irvine.oeis.a074;
// manually seqop at 2023-06-02 22:32

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A074657 Number of Lyndon words (aperiodic necklaces) with 5n beads of 5 colors, n beads of each color.
 * @author Georg Fischer
 */
public class A074657 extends AbstractSequence {

  private int mN = -1;
  private final A074653 mSeq = new A074653();

  /** Construct the sequence. */
  public A074657() {
    super(0);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return mSeq.next().divide(5);
  }
}
