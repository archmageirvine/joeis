package irvine.oeis.a147;
// manually ca2elem/ca2on at 2021-12-23 19:20

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A147562 Number of "ON" cells at n-th stage in the "Ulam-Warburton" two-dimensional cellular automaton.
 * @author Georg Fischer
 */
public class A147562 extends FiveNeighbor2DAutomaton {

  private int mN;

  /** Construct the sequence. */
  public A147562() {
    super(558);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    return super.next();
  }
}
