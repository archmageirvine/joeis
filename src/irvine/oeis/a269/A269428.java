package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269428 Alternating sum of heptagonal pyramidal numbers.
 * @author Sean A. Irvine
 */
public class A269428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269428() {
    super(new long[] {1, 3, 2, -2, -3}, new long[] {0, -1, 7, -19, 41});
  }
}
