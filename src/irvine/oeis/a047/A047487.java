package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047487 Numbers that are congruent to {2, 3, 5, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047487() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {2, 3, 5, 7, 10});
  }
}
