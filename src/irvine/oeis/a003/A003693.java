package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003693 Number of 2-factors in P_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003693() {
    super(1, new long[] {1, -3, -2, 7, 2}, new long[] {0, 2, 3, 18, 54});
  }
}
