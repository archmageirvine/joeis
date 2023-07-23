package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A056485 Number of primitive (aperiodic) palindromic structures using exactly six different symbols.
 * @author Georg Fischer
 */
public class A056485 extends AbstractSequence {

  private final A056479 mSeq1 = new A056479();

  /** Construct the sequence. */
  public A056485() {
    super(1);
  }

  private final Sequence mSeq = new A056480();

  {
    next();
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(mSeq1.next());
  }
}
