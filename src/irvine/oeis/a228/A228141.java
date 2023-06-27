package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228141 Numbers that are congruent to {1, 5} mod 20.
 * @author Sean A. Irvine
 */
public class A228141 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228141() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 5, 21});
  }
}
