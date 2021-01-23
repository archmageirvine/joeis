package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047346 Numbers that are congruent to {1, 4} mod 7.
 * @author Sean A. Irvine
 */
public class A047346 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047346() {
    super(new long[] {-1, 1, 1}, new long[] {1, 4, 8});
  }
}
