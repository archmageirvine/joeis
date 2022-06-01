package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247792 a(n) = 9*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A247792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247792() {
    super(new long[] {1, -3, 3}, new long[] {1, 10, 37});
  }
}
