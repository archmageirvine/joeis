package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247560 a(n) = 3*a(n-1) - 4*a(n-2) with a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A247560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247560() {
    super(new long[] {-4, 3}, new long[] {1, 1});
  }
}
