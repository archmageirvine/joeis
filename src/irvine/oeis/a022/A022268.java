package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022268 a(n) = n*(11*n - 1)/2.
 * @author Sean A. Irvine
 */
public class A022268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022268() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 21});
  }
}
