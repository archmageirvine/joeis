package irvine.oeis.a038;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038707 a(n) = floor(n*(n+1/2)/2).
 * @author Sean A. Irvine
 */
public class A038707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038707() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 0, 2, 5, 9, 13});
  }
}
