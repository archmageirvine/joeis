package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247595 a(n) = 4*a(n-1) - 4*a(n-2) + 4*a(n-3) with a(0) = 1, a(1) = 3, a(2) = 10.
 * @author Sean A. Irvine
 */
public class A247595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247595() {
    super(new long[] {4, -4, 4}, new long[] {1, 3, 10});
  }
}
