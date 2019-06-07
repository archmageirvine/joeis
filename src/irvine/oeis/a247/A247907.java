package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247907 Expansion of <code>(1 + x) / ((1 - x^4) * (1 - x - x^5))</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A247907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247907() {
    super(new long[] {-1, 1, -1, 1, -1, 2, -2, 2}, new long[] {1, 2, 2, 2, 3, 5, 7, 9});
  }
}
