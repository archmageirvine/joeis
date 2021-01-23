package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174398 Numbers that are congruent to {1, 4, 5, 8} mod 12.
 * @author Sean A. Irvine
 */
public class A174398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174398() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 4, 5, 8});
  }
}
