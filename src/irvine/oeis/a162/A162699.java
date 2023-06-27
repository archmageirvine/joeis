package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162699 Odd numbers not divisible by 7.
 * @author Sean A. Irvine
 */
public class A162699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162699() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 3, 5, 9, 11, 13, 15});
  }
}
