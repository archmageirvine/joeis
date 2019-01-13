package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125904.
 * @author Sean A. Irvine
 */
public class A125904 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125904() {
    super(new long[] {-40320, 109584, -118124, 67284, -22449, 4536, -546, 36}, new long[] {10, 100, 1000, 9976, 98920, 971440, 9420400, 90005176});
  }
}
