package irvine.oeis.a307;
// manually 2025-06-23/ratos at 2025-06-23 16:30

import irvine.oeis.recur.RationalRecurrence;

/**
 * A307131 Numerator of the expected fraction of occupied places on n-length lattice randomly filled with 2-length segments.
 * @author Georg Fischer
 */
public class A307131 extends RationalRecurrence {

  /** Construct the sequence. */
  public A307131() {
    super(1, "[[-2],[4,-2],[-2,3,-1],[0,-1,1]]", "0,1,2/3,5/6,4/5", 0, 0);
    nextQ();
  }
}
