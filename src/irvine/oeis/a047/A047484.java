package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047484 Numbers that are congruent to {3, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047484() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 5, 7, 11});
  }
}
