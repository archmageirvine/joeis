package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047342 Numbers that are congruent to {0, 3, 4} mod 7.
 * @author Sean A. Irvine
 */
public class A047342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047342() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {0, 3, 4, 7});
  }
}
