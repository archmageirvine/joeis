package irvine.oeis.a285;
// Generated by gen_seq4.pl ca2elem/ca2ind at 2021-12-23 22:26

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A285542 Decimal representation of the diagonal from the corner to the origin of the n-th stage of growth of the two-dimensional cellular automaton defined by "Rule 35", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A285542 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A285542() {
    super(35);
  }

  @Override
  public Z next() {
    return super.nextCornerOriginD();
  }
}
