package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062938 a(n) = n*(n+1)*(n+2)*(n+3)+1, which equals (n^2 +3*n + 1)^2.
 * @author Sean A. Irvine
 */
public class A062938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062938() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 25, 121, 361, 841});
  }
}
