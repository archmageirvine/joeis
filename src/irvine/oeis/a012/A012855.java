package irvine.oeis.a012;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A012855 a(0) = 0, a(1) = 1, a(2) = 1; thereafter a(n) = 5*a(n-1) - 4*a(n-2) + a(n-3).
 * @author Sean A. Irvine
 */
public class A012855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A012855() {
    super(new long[] {1, -4, 5}, new long[] {0, 1, 1});
  }
}
