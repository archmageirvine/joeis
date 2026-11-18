package irvine.oeis.a350;

import irvine.math.graph.UnlabeledAcyclicDigraphs.Kind;

/**
 * A350491 Triangle read by rows: T(n,k) is the number of acyclic digraphs on n unlabeled nodes with k arcs and a global source and sink, n &gt;= 1, k = 0..n*(n-1)/2.
 * @author Gregory Morse
 */
public class A350491 extends A350447 {
  /** Construct the sequence. */
  public A350491() {
    super(1, Kind.SOURCE_SINK);
  }
}
