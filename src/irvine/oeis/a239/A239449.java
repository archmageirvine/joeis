package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239449 7*n^2 - 5*n + 1.
 * @author Sean A. Irvine
 */
public class A239449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239449() {
    super(new long[] {1, -3, 3}, new long[] {1, 3, 19});
  }
}
