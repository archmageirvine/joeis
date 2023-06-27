package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003776 Number of 2-factors in P_5 X P_2n.
 * @author Sean A. Irvine
 */
public class A003776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003776() {
    super(1, new long[]{26, -57, 24}, new long[]{3, 54, 1140});
  }
}
