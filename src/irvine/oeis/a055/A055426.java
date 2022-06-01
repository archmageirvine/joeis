package irvine.oeis.a055;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A055426 Number of points in Z^n of norm &lt;= 2.
 * @author Sean A. Irvine
 */
public class A055426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055426() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 5, 13, 33, 89});
  }
}
