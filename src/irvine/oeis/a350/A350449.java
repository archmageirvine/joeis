package irvine.oeis.a350;

import irvine.math.graph.UnlabeledAcyclicDigraphs.Kind;

/**
 * A350449 Triangle read by rows: T(n,k) is the number of weakly connected acyclic digraphs on n unlabeled nodes with k arcs, n &gt;= 1, k = 0..(n-1)*n/2.
 * @author Gregory Morse
 */
public class A350449 extends A350447 {
  /** Construct the sequence. */
  public A350449() {
    super(1, Kind.CONNECTED);
  }
}
