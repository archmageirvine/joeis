package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047404 Numbers that are congruent to {1, 2, 3, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047404() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 2, 3, 6});
  }
}
