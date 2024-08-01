package irvine.oeis.a270;
// manually xx/ca2on at 2021-12-29 15:11

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A270565 Number of active (ON, black) cells at stage 2^n-1 of the two-dimensional cellular automaton defined by "Rule 315", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A270565 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A270565() {
    super(315);
  }

  @Override
  public Z next() {
    return super.nextOn2n1();
  }
}
