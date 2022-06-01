package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015519 a(n) = 2*a(n-1) + 7*a(n-2).
 * @author Sean A. Irvine
 */
public class A015519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015519() {
    super(new long[] {7, 2}, new long[] {0, 1});
  }
}
