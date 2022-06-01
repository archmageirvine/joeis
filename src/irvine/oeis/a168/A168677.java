package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168677 Lexicographically earliest positive integer sequence such that no sum of consecutive terms is a positive power of 4.
 * @author Sean A. Irvine
 */
public class A168677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168677() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 5, 1, 1, 1, 9});
  }
}
