package irvine.oeis.a331;

import irvine.oeis.a159.A159065;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A331755 Number of vertices in a regular drawing of the complete bipartite graph K_{n,n}.
 * @author Gregory Morse
 */
public class A331755 extends SingleTransformSequence {
  /** Construct the sequence. */
  public A331755() {
    super(1, (t, n) -> t.add(2L * n), new A159065());
  }
}
