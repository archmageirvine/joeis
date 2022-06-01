package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247594 a(n) = a(n-1) + a(n-2) + 3*a(n-3) with a(0) = 1, a(1) = 2, a(2) = 5.
 * @author Sean A. Irvine
 */
public class A247594 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247594() {
    super(new long[] {3, 1, 1}, new long[] {1, 2, 5});
  }
}
