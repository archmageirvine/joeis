package irvine.oeis.a142;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A142881 a(0) = 0, a(1) = 1, after which, if n=3k: a(n) = 2*a(n-1) - a(n-2), if n=3k+1: a(n) = a(n-1) + a(n-2), if n=3k+2: a(n) = 2*a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A142881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142881() {
    super(new long[] {-1, 0, 0, 7, 0, 0}, new long[] {0, 1, 2, 3, 5, 13});
  }
}
