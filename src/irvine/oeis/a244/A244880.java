package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244880 Number of magic labelings of the cycle-of-loops graph LOOP X C_8 having magic sum n, where LOOP is the 1-vertex, 1-loop-edge graph.
 * @author Sean A. Irvine
 */
public class A244880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244880() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 47, 650, 4726, 23219, 87677, 274132, 743724, 1806597});
  }
}
