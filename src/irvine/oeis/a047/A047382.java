package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047382 Numbers that are congruent to {0, 5} mod 7.
 * @author Sean A. Irvine
 */
public class A047382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047382() {
    super(new long[] {-1, 1, 1}, new long[] {0, 5, 7});
  }
}
