package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083030 Numbers that are congruent to {0, 4, 7} mod 12.
 * @author Sean A. Irvine
 */
public class A083030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083030() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 4, 7, 12});
  }
}
