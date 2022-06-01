package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138826 Concatenation of 2n-1 digits 1, n digits 0 and 2n-1 digits 1.
 * @author Sean A. Irvine
 */
public class A138826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138826() {
    super(new long[] {-10000000000L, 10110100000L, -110201100, 101101}, new long[] {101, 11100111, 1111100011111L, 111111100001111111L});
  }
}
