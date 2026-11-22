package irvine.oeis.a362;

import irvine.math.z.Z;
import irvine.oeis.a286.A286189;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A362575 Number of vertex cuts in the n X n rook graph.
 * @author Gregory Morse
 */
public class A362575 extends SingleTransformSequence {
  /** Construct the sequence. */
  public A362575() {
    super(1, (t, n) -> Z.ONE.shiftLeft((long) n * n).subtract(1).subtract(t), new A286189());
  }
}
