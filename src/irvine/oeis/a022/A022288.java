package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022288 a(n) = n*(31*n-1)/2.
 * @author Sean A. Irvine
 */
public class A022288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022288() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 61});
  }
}
