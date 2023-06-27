package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047278 Numbers that are congruent to {1, 2, 6} mod 7.
 * @author Sean A. Irvine
 */
public class A047278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047278() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 2, 6, 8});
  }
}
