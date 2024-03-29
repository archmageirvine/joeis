package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047604 Numbers that are congruent to {2, 3, 5} mod 8.
 * @author Sean A. Irvine
 */
public class A047604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047604() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {2, 3, 5, 10});
  }
}
