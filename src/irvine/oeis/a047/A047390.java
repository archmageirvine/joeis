package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047390 Numbers that are congruent to {0, 3, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047390() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 3, 5, 7});
  }
}
