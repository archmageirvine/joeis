package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281235 Solutions x to the negative Pell equation y^2 = 72*x^2 - 332928 with x,y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A281235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281235() {
    super(1, new long[] {-1, 0, 0, 6, 0, 0}, new long[] {68, 76, 132, 204, 324, 716});
  }
}
