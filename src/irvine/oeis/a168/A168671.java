package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168671 Numbers that are congruent to {1, 10} mod 13.
 * @author Sean A. Irvine
 */
public class A168671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168671() {
    super(new long[] {-1, 1, 1}, new long[] {1, 10, 14});
  }
}
