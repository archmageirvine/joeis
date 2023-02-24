package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158842 a(n) = 1 + n*(n+1)*(n-1)/2.
 * @author Sean A. Irvine
 */
public class A158842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158842() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 13, 31});
  }
}
