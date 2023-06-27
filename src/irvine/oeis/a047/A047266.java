package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047266 Numbers that are congruent to {0, 1, 5} mod 6.
 * @author Sean A. Irvine
 */
public class A047266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047266() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 1, 5, 6});
  }
}
