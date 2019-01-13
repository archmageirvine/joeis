package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267275.
 * @author Sean A. Irvine
 */
public class A267275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267275() {
    super(new long[] {100000000000L, -100000000000L, 0, -100000000, 99999000, 1000, 0, 1},
      new long[] {1, 111, 10011, 1111011, 100011011, 11101011011L, 1001111011011L, 111100011011011L});
  }
}
