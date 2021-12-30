package irvine.oeis.a122;
// manually at 2021-12-23

import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A122108 a(n)=number of 1's ("live" cells) at stage n of a 2-dimensional cellular automaton evolving by the rule: 1 if N+S+E+W is 1 or 2, else 0, starting from a single live cell.
 * @author Georg Fischer
 */
public class A122108 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A122108() {
    super(20);
  }
}
