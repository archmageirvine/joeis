package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059938 Sum of binary numbers with <code>n 1</code>'s and two <code>(non-leading) 0</code>'s.
 * @author Sean A. Irvine
 */
public class A059938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059938() {
    super(new long[] {-8, 36, -66, 63, -33, 9}, new long[] {0, 4, 31, 141, 506, 1590});
  }
}
