package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172075 a(n) = n*(n+1)*(9*n^2 - n - 5)/6.
 * @author Sean A. Irvine
 */
public class A172075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172075() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 29, 146, 450});
  }
}
