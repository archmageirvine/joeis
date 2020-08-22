package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138120 Concatenation of n digits 1, 2n-1 digits 0 and n digits 1.
 * @author Sean A. Irvine
 */
public class A138120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138120() {
    super(new long[] {-100000000, 110110000, -10121010, 11011}, new long[] {101, 1100011, 11100000111L, 111100000001111L});
  }
}
