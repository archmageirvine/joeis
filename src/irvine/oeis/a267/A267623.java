package irvine.oeis.a267;
// manually ca2elem/ca2leftb at 2021-12-23 21:22

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A267623 Binary representation of the middle column of the "Rule 187" elementary cellular automaton starting with a single ON (black) cell.
 * @author Georg Fischer
 */
public class A267623 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A267623() {
    super(643);
  }

  @Override
  public Z next() {
    return super.nextOriginRightB();
  }
}
