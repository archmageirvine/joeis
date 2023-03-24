package irvine.oeis.a308;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a320.A320471;

/**
 * A308720 The maximum value in the continued fraction of sqrt(n), or 0 if there is no fractional part.
 * @author Georg Fischer
 */
public class A308720 extends AbstractSequence {

  private int mN = -1;
  private final A320471 mSeq = new A320471();

  /** Construct the sequence. */
  public A308720() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Z.TWO.multiply(mSeq.next());
  }
}
