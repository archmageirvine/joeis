package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003730 Number of 2-factors in C_5 X P_n.
 * @author Sean A. Irvine
 */
public class A003730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003730() {
    super(1, new long[] {3, -22, -4, 9}, new long[] {1, 11, 81, 666});
  }
}
