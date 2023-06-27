package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080663 a(n) = 3*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A080663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080663() {
    super(1, new long[] {1, -3, 3}, new long[] {2, 11, 26});
  }
}
