package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281238 Solutions y to the negative Pell equation y^2 = 72*x^2 - 73728 with x,y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A281238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281238() {
    super(1, new long[] {-1, 6}, new long[] {0, 768});
  }
}
