package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091434 Poincar\u00e9 series [or Poincare series] (or Molien series) for a certain four-fold wreath product P_4.
 * @author Sean A. Irvine
 */
public class A091434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091434() {
    super(new long[] {-1, 2, 0, -1, -1, 0, 3, -3, 1, 0, -1, 1, 1, 0, -3, 1, 4, -2, -3, 2, 0, 0, 0, 2, -3, -2, 4, 1, -3, 0, 1, 1, -1, 0, 1, -3, 3, 0, -1, -1, 0, 2}, new long[] {1, 0, 1, 1, 2, 2, 5, 4, 9, 10, 15, 18, 29, 31, 47, 56, 76, 91, 124, 143, 191, 226, 286, 340, 430, 499, 622, 729, 885, 1035, 1250, 1443, 1729, 1997, 2354, 2713, 3184, 3635, 4239, 4834, 5580, 6344});
  }
}
