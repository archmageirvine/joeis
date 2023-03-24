package irvine.oeis.a152;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a027.A027375;

/**
 * A152061 Counts of unique periodic binary strings of length n.
 * @author Georg Fischer
 */
public class A152061 extends AbstractSequence {

  private int mN = -1;
  private final A027375 mSeq = new A027375();

  /** Construct the sequence. */
  public A152061() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.ONE.shiftLeft(mN).subtract(mSeq.next());
    return (mN == 0) ? Z.ZERO : result;
  }
}
