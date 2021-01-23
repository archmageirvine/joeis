package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047531 Numbers that are congruent to {2, 3, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047531 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047531() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 3, 7, 10});
  }
}
