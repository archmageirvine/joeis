package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053441 Moments of generalized Motzkin paths.
 * @author Sean A. Irvine
 */
public class A053441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053441() {
    super(new long[] {-1, 0, 0, 2, 4, 0}, new long[] {1, 0, 4, 4, 16, 24});
  }
}
