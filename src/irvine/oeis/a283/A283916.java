package irvine.oeis.a283;
// Generated by gen_seq4.pl ca2elem/ca2leftd at 2021-12-23 22:26

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A283916 Decimal representation of the x-axis, from the left edge to the origin, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 777", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A283916 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A283916() {
    super(777);
  }

  @Override
  public Z next() {
    return super.nextLeftOriginD();
  }
}
