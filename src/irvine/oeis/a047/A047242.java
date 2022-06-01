package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047242 Numbers that are congruent to {0, 1, 3} mod 6.
 * @author Sean A. Irvine
 */
public class A047242 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047242() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 3, 6});
  }
}
