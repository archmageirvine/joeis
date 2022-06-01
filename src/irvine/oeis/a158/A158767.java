package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158767 a(n) = 76*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A158767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158767() {
    super(new long[] {1, -3, 3}, new long[] {1, 77, 305});
  }
}
