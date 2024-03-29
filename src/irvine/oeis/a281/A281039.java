package irvine.oeis.a281;
// Generated by gen_seq4.pl ca2elem/ca2leftb at 2021-12-23 22:26

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A281039 Binary representation of the x-axis, from the left edge to the origin, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 313", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A281039 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A281039() {
    super(313);
  }

  @Override
  public Z next() {
    return super.nextLeftOriginB();
  }
}
