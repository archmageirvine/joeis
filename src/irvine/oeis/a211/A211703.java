package irvine.oeis.a211;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A211703 a(n) = n + [n/2] + [n/3] + [n/4], where [] = floor.
 * @author Sean A. Irvine
 */
public class A211703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211703() {
    super(1, new long[] {-1, 0, 0, 1, 1, 0, 0}, new long[] {1, 3, 5, 8, 9, 12, 13});
  }
}
