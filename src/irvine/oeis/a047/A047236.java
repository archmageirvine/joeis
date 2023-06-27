package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047236 Numbers that are congruent to {1, 2, 4} mod 6.
 * @author Sean A. Irvine
 */
public class A047236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047236() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 2, 4, 7});
  }
}
