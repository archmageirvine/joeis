package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172482 <code>a(n) = (1+n)*(9 + 11*n + 4*n^2)/3</code>.
 * @author Sean A. Irvine
 */
public class A172482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172482() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 16, 47, 104});
  }
}
