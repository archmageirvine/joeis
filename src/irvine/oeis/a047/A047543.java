package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047543 Numbers that are congruent to {3, 4, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047543() {
    super(new long[] {-1, 1, 0, 1}, new long[] {3, 4, 7, 11});
  }
}
