package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107480 a(n) = a(n-1) + a(n-3) + a(n-4) + a(n-5) + a(n-7).
 * @author Sean A. Irvine
 */
public class A107480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107480() {
    super(new long[] {1, 0, 1, 1, 1, 0, 1}, new long[] {0, 1, 1, 2, 3, 5, 8});
  }
}
