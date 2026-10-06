package irvine.oeis.a249;
// manually roban1/adjext at 2026-10-06 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a084.A084937;

/**
 * A249683 a(n) = A084937(3n+2)/2.
 * @author Georg Fischer
 */
public class A249683 extends AbstractSequence {

  private final Sequence mSeq = new A084937();

  /** Construct the sequence */
  public A249683() {
    super(0);
  }

  @Override
  public Z next() {
    mSeq.next();
    final Z result = mSeq.next().divide(2);
    mSeq.next();
    return result;
  }
}
