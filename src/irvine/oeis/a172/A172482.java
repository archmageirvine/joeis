package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172482 a(n) = (1+n)*(9 + 11*n + 4*n^2)/3.
 * @author Sean A. Irvine
 */
public class A172482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172482() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 16, 47, 104});
  }
}
