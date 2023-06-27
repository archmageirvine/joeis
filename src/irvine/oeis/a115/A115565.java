package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115565 a(n) = 5*n^4 - 10*n^3 + 20*n^2 - 15*n + 11.
 * @author Sean A. Irvine
 */
public class A115565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115565() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {11, 61, 281, 911, 2311});
  }
}
