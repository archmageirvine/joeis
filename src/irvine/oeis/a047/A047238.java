package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047238 Numbers that are congruent to {0, 2} mod 6.
 * @author Sean A. Irvine
 */
public class A047238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047238() {
    super(new long[] {-1, 1, 1}, new long[] {0, 2, 6});
  }
}
