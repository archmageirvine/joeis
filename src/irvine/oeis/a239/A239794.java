package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239794 5*n^2 + 4*n - 15.
 * @author Sean A. Irvine
 */
public class A239794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239794() {
    super(1, new long[] {1, -3, 3}, new long[] {-6, 13, 42});
  }
}
