package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047499 Numbers that are congruent to {3, 4, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047499() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {3, 4, 5, 7, 11});
  }
}
