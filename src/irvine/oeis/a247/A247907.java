package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247907 Expansion of (1 + x) / ((1 - x^4) * (1 - x - x^5)) in powers of x.
 * @author Sean A. Irvine
 */
public class A247907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247907() {
    super(new long[] {-1, 1, -1, 1, -1, 2, -2, 2}, new long[] {1, 2, 2, 2, 3, 5, 7, 9});
  }
}
