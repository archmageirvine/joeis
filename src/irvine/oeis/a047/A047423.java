package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047423 Numbers that are congruent to {2, 3, 4, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047423() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {2, 3, 4, 5, 6, 10});
  }
}
