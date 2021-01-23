package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247564 a(n) = 3*a(n-2) - 4*a(n-4) with a(0) = 2, a(1) = 1, a(2) = 3, a(3) = 1.
 * @author Sean A. Irvine
 */
public class A247564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247564() {
    super(new long[] {-4, 0, 3, 0}, new long[] {2, 1, 3, 1});
  }
}
