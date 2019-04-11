package irvine.oeis.a142;

import irvine.oeis.LinearRecurrence;

/**
 * A142881 <code>a(0) = 0, a(1) = 1,</code> after which, if n=3k: <code>a(n) = 2*a(n-1) - a(n-2),</code> if n=3k+1: <code>a(n) = a(n-1) + a(n-2),</code> if n=3k+2: <code>a(n) = 2*a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A142881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142881() {
    super(new long[] {-1, 0, 0, 7, 0, 0}, new long[] {0, 1, 2, 3, 5, 13});
  }
}
