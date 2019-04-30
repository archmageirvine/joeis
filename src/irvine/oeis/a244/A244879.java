package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244879 Number of magic labelings of the cycle-of-loops graph LOOP X C_6 having magic sum n, where LOOP is the 1-vertex, 1-loop-edge graph.
 * @author Sean A. Irvine
 */
public class A244879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244879() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 18, 129, 571, 1884, 5103, 11998});
  }
}
