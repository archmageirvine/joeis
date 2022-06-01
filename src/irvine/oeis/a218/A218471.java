package irvine.oeis.a218;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A218471 a(n) = n*(7*n-3)/2.
 * @author Sean A. Irvine
 */
public class A218471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218471() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 11});
  }
}
