package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269112 a(n) = (3*(n-1)*n + (-1)^((n-1)*n/2) + 5)/2.
 * @author Sean A. Irvine
 */
public class A269112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269112() {
    super(1, new long[] {1, -3, 4, -4, 3}, new long[] {3, 5, 11, 21, 33});
  }
}
