package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129895 a(1)=1. a(n) = a(n-1) + number of triangular numbers among the first (n-1) terms of the sequence.
 * @author Sean A. Irvine
 */
public class A129895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129895() {
    super(1, new long[] {1, -2, 0, 2, 0, -2, 0, 2}, new long[] {1, 2, 3, 5, 7, 9, 11, 13});
  }
}
