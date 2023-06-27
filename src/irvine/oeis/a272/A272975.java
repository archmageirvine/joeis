package irvine.oeis.a272;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A272975 Numbers that are congruent to {0,7} mod 12.
 * @author Sean A. Irvine
 */
public class A272975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272975() {
    super(1, new long[] {-1, 1, 1}, new long[] {0, 7, 12});
  }
}
