package irvine.oeis.a272;
// Generated by gen_seq4.pl ca2on2/ca2on2n1 at 2021-12-27 18:33

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A272806 Number of active (ON, black) cells at stage 2^n-1 of the two-dimensional cellular automaton defined by "Rule 541", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A272806 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A272806() {
    super(541);
  }

  @Override
  public Z next() {
    return super.nextOn2n1();
  }
}
