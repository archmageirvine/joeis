package irvine.oeis.a223;
// manually egfu at 2021-12-05 20:35

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A223346 3 X 3 X 3 triangular graph without horizontal edges coloring a rectangular array: number of n X 1 0..5 arrays where 0..5 label nodes of a graph with edges 0,1 0,2 1,3 1,4 2,4 2,5 and every array movement to a horizontal or vertical neighbor moves along an edge of this graph.
 * G.f: 2*(x^2-6*x-3)/(5*x^2-1).
 * @author Georg Fischer
 */
public class A223346 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A223346() {
    super(0, "[-6,-12, 2]", "[-1, 0, 5]");
  }
}
