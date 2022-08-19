package irvine.oeis.a223;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A223346 3 X 3 X 3 triangular graph without horizontal edges coloring a rectangular array: number of n X 1 0..5 arrays where 0..5 label nodes of a graph with edges 0,1 0,2 1,3 1,4 2,4 2,5 and every array movement to a horizontal or vertical neighbor moves along an edge of this graph.
 * @author Georg Fischer
 */
public class A223346 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A223346() {
    super(1, "[0, 5, 0,-1]", "[6, 12, 28]", 0);
  }
}
