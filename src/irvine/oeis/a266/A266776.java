package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266776 Molien series for invariants of finite Coxeter group <code>A_7</code>.
 * @author Sean A. Irvine
 */
public class A266776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266776() {
    super(new long[] {1, 0, -1, -1, -1, 0, 0, 1, 1, 2, 2, 1, -1, -2, -2, -3, -2, -1, 1, 2, 3, 2, 2, 1, -1, -2, -2, -1, -1, 0, 0, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 2, 4, 4, 7, 7, 11, 12, 18, 19, 27, 30, 40, 44, 58, 64, 82, 91, 113, 126, 155, 171, 207, 230, 274, 303, 358, 395, 462, 509, 589});
  }
}
