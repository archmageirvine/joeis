package irvine.oeis.a069;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A069909 Numbers congruent to +-1, +-4, +-6, +-7 mod 16.
 * @author Sean A. Irvine
 */
public class A069909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069909() {
    super(new long[] {-1, 2, -1, 0, -1, 2}, new long[] {1, 4, 6, 7, 9, 10});
  }
}
