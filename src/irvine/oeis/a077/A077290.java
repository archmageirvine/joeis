package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077290 Triangular numbers that are 6 times other triangular numbers.
 * @author Sean A. Irvine
 */
public class A077290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077290() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {0, 6, 36, 630, 3570});
  }
}
