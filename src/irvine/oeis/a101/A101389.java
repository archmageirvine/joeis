package irvine.oeis.a101;

import irvine.math.graph.Edges;

/**
 * A101389 Number of n-vertex unlabeled oriented graphs without endpoints.
 * @author Gregory Morse
 */
public class A101389 extends A101388 {
  /** Construct the sequence. */
  public A101389() {
    super(Edges.ORIENTED_GRAPH_EDGES, 2, 3);
  }
}
