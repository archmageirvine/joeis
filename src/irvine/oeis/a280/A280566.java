package irvine.oeis.a280;
// Generated by gen_seq4.pl ca2elem/ca2rightb at 2021-12-23 22:26

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A280566 Binary representation of the x-axis, from the origin to the right edge, of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 291", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A280566 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A280566() {
    super(291);
  }

  @Override
  public Z next() {
    return super.nextOriginRightB();
  }
}
