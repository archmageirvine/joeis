package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047245 Numbers that are congruent to {1, 2, 3} mod 6.
 * @author Sean A. Irvine
 */
public class A047245 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047245() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 2, 3, 7});
  }
}
