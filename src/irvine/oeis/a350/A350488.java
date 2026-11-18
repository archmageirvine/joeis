package irvine.oeis.a350;

import irvine.math.graph.UnlabeledAcyclicDigraphs.Kind;

/**
 * A350488 Triangle read by rows: T(n,k) is the number of acyclic digraphs on n unlabeled nodes with k arcs and a global source, n &gt;= 1, k = 0..n*(n-1)/2.
 * @author Gregory Morse
 */
public class A350488 extends A350447 {
  /** Construct the sequence. */
  public A350488() {
    super(1, Kind.SOURCE);
  }
}
