package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047340 Numbers that are congruent to {0, 2, 3, 4} mod 7.
 * @author Sean A. Irvine
 */
public class A047340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047340() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 3, 4, 7});
  }
}
