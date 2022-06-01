package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022278 a(n) = n*(21*n-1)/2.
 * @author Sean A. Irvine
 */
public class A022278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022278() {
    super(new long[] {1, -3, 3}, new long[] {0, 10, 41});
  }
}
