package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059937 Sum of binary numbers with <code>n 1</code>'s and two (possibly leading) <code>0</code>'s.
 * @author Sean A. Irvine
 */
public class A059937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059937() {
    super(new long[] {-8, 36, -66, 63, -33, 9}, new long[] {0, 7, 45, 186, 630, 1905});
  }
}
