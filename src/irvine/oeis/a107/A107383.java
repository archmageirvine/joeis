package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107383 a(n) = 2*a(n-2) + 2*a(n-3).
 * @author Sean A. Irvine
 */
public class A107383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107383() {
    super(new long[] {2, 2, 0}, new long[] {0, 1, 1});
  }
}
