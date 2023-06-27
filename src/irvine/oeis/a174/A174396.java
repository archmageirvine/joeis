package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174396 Numbers congruent to {1,4,5,8} mod 9.
 * @author Sean A. Irvine
 */
public class A174396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174396() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {1, 4, 5, 8, 10});
  }
}
