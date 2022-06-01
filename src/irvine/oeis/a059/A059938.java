package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059938 Sum of binary numbers with n 1's and two (non-leading) 0's.
 * @author Sean A. Irvine
 */
public class A059938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059938() {
    super(new long[] {-8, 36, -66, 63, -33, 9}, new long[] {0, 4, 31, 141, 506, 1590});
  }
}
