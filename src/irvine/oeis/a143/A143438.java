package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143438 a(n) = a(n-2) + a(n-3) + a(n-4) - a(n-6), with a(0) = a(2) = a(3) = 1, a(1) = 0 and a(4) = a(5) = 2.
 * @author Sean A. Irvine
 */
public class A143438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143438() {
    super(new long[] {-1, 0, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 2});
  }
}
