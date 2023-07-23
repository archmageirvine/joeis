package irvine.oeis.a213;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a048.A048784;

/**
 * A213595 A048784(n) / 2^A213594(n).
 * @author Georg Fischer
 */
public class A213595 extends AbstractSequence {

  private final A048784 mSeq1 = new A048784();

  /** Construct the sequence. */
  public A213595() {
    super(1);
  }

  private final Sequence mSeq = new A213594();

  {
    mSeq1.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().divide(Z.ONE.shiftLeft(mSeq.next().longValue()));
  }
}
