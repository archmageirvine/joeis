package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083033 Numbers that are congruent to {0, 2, 3, 5, 7, 9, 10} mod 12.
 * @author Sean A. Irvine
 */
public class A083033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083033() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 2, 3, 5, 7, 9, 10, 12});
  }
}
