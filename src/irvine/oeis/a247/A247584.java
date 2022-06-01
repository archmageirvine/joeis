package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247584 a(n) = 5*a(n-1) - 10*a(n-2) + 10*a(n-3) - 5*a(n-4) + 3*a(n-5) with a(0) = a(1) = a(2) = a(3) = a(4) = 1.
 * @author Sean A. Irvine
 */
public class A247584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247584() {
    super(new long[] {3, -5, 10, -10, 5}, new long[] {1, 1, 1, 1, 1});
  }
}
