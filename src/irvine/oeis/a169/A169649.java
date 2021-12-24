package irvine.oeis.a169;
// manually ca2elem/ca2on at 2021-12-23 19:20

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A169649 Total number of cells that are ON at stage n in Wolfram's 2-D cellular automaton defined by Rule 942.
 * @author Georg Fischer
 */
public class A169649 extends FiveNeighbor2DAutomaton {

  private int mN;

  /** Construct the sequence. */
  public A169649() {
    super(942);
    mN = -2;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == -1) {
      return Z.ZERO;
    }
    return super.next();
  }
}
