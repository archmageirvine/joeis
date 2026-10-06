package irvine.oeis.a104;
// manually roban1/adjext at 2026-10-06 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a028.A028920;

/**
 * A104706 First terms in the rearrangements of integer numbers (see comments).
 * @author Georg Fischer
 */
public class A104706 extends AbstractSequence {

  private final Sequence mSeq = new A028920();

  /** Construct the sequence */
  public A104706() {
    super(1);
  }

  @Override
  public Z next() {
    mSeq.next();
    return mSeq.next().subtract(1);
  }
}
