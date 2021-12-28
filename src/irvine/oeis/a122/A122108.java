package irvine.oeis.a122;
// manually at 2021-12-23

import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A122108 Number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 20", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A122108 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A122108() {
    super(20);
  }
}
