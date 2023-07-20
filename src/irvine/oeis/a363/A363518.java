package irvine.oeis.a363;
// manually robot/lingf at 2023-07-20

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A363518 Concentric square numbers on the faces of an n X n X n cube.
 * @author Georg Fischer
 */
public class A363518 extends AbstractSequence {

  private final GeneratingFunctionSequence mSeq = new GeneratingFunctionSequence(0, "[1, 5, 0, 0, 5, 1]", "[1,-3, 4,-4, 3,-1]");

  /** Construct the sequence. */
  public A363518() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next();
  }
}
