package irvine.oeis.a290;

import irvine.oeis.a159.A159065;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A290132 The number of edges in a graph induced by a regular drawing of K_{n,n}.
 * @author Gregory Morse
 */
public class A290132 extends PairTransformSequence {
  /** Construct the sequence. */
  public A290132() {
    super(1, new A290131(), new A159065(), (n, regions, crossings) -> regions.add(crossings).add(2L * n - 1));
  }
}
