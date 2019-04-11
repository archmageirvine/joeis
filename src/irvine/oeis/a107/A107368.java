package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107368 <code>a(n) = a(n-1) + a(n-2) - a(n-3) + a(n-5)</code>.
 * @author Sean A. Irvine
 */
public class A107368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107368() {
    super(new long[] {1, 0, -1, 1, 1}, new long[] {0, 0, 1, 0, 1});
  }
}
