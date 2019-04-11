package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113763 Non-multiples of <code>13,</code> or numbers not divisible by 13.
 * @author Sean A. Irvine
 */
public class A113763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113763() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14});
  }
}
