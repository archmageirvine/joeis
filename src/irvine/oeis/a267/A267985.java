package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267985 Numbers congruent to {7, 13} mod 30.
 * @author Sean A. Irvine
 */
public class A267985 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267985() {
    super(1, new long[] {-1, 1, 1}, new long[] {7, 13, 37});
  }
}
