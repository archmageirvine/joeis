package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266085 Alternating sum of heptagonal numbers.
 * @author Sean A. Irvine
 */
public class A266085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266085() {
    super(new long[] {1, 2, 0, -2}, new long[] {0, -1, 6, -12});
  }
}
