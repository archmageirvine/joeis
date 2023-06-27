package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047556 Numbers that are congruent to {3, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047556() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {3, 6, 7, 11});
  }
}
