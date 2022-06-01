package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047431 Numbers that are congruent to {1, 4, 5, 6} mod 8.
 * @author Sean A. Irvine
 */
public class A047431 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047431() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 4, 5, 6});
  }
}
