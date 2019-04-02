package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169598 Numbers that are congruent to {3,18} mod 23.
 * @author Sean A. Irvine
 */
public class A169598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169598() {
    super(new long[] {-1, 1, 1}, new long[] {3, 18, 26});
  }
}
