package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003758 Number of 2-factors in D_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003758() {
    super(1, new long[]{1, -3, -3, 9, 3}, new long[]{0, 3, 7, 46, 193});
  }
}
