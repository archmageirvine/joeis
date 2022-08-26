package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027599 a(n) = 3*n^2 - 7*n + 6.
 * @author Sean A. Irvine
 */
public class A027599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027599() {
    super(new long[] {1, -3, 3}, new long[] {6, 2, 4});
  }
}
