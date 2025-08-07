package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A079316 Number of first-quadrant cells (including the two boundaries) that are ON at stage n of the cellular automaton described in A079317.
 * @author Sean A. Irvine
 */
public class A079316 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A079316() {
    super(678);
  }

  @Override
  protected Z select(final long tsum, final long lsum, final long rsum, final long org) {
    return Z.valueOf(2 * tsum + 2 * lsum + 2 * rsum - 3 * org);
  }
}
