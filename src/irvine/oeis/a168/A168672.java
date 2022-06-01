package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168672 Numbers that are congruent to {2,13} mod 17.
 * @author Sean A. Irvine
 */
public class A168672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168672() {
    super(new long[] {-1, 1, 1}, new long[] {2, 13, 19});
  }
}
