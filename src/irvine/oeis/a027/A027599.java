package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027599 a(n) = 3n^2 - 7n + 6.
 * @author Sean A. Irvine
 */
public class A027599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027599() {
    super(new long[] {1, -3, 3}, new long[] {6, 2, 4});
  }
}
