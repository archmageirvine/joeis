package irvine.oeis.a279;
// Generated by gen_seq4.pl ca.1m/ca2leftb at 2021-12-28 07:10

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A279177 Binary representation of the x-axis, from the left edge to the origin, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 149", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A279177 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A279177() {
    super(149);
  }

  @Override
  public Z next() {
    return super.nextLeftOriginB();
  }
}
