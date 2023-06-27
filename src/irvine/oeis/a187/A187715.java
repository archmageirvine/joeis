package irvine.oeis.a187;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A187715 a(n) = 5*n - (9 + (-1)^n)/2.
 * @author Sean A. Irvine
 */
public class A187715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187715() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 5, 11});
  }
}
