package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003698 Number of 2-factors in C_4 X P_n.
 * @author Sean A. Irvine
 */
public class A003698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003698() {
    super(1, new long[] {-4, 3, 6}, new long[] {1, 9, 53});
  }
}
