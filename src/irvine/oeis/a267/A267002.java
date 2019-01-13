package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267002.
 * @author Sean A. Irvine
 */
public class A267002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267002() {
    super(new long[] {10000000, 0, -10011000, 0, 11001, 0}, new long[] {1, 101, 1000, 1101111, 1000000, 11101111111L});
  }
}
