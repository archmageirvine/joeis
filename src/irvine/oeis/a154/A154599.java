package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154599 a(n) = 2*n^2 + 20*n + 8.
 * @author Sean A. Irvine
 */
public class A154599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154599() {
    super(1, new long[] {1, -3, 3}, new long[] {30, 56, 86});
  }
}
