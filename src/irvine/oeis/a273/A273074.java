package irvine.oeis.a273;
// Generated by gen_seq4.pl ca2on2/ca2on2n1 at 2021-12-27 18:33

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A273074 Number of active (ON, black) cells at stage 2^n-1 of the two-dimensional cellular automaton defined by "Rule 585", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A273074 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A273074() {
    super(585);
  }

  @Override
  public Z next() {
    return super.nextOn2n1();
  }
}
