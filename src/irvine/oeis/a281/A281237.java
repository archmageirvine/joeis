package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281237 Solutions x to the negative Pell equation y^2 = 72*x^2 - 73728 with x,y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A281237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281237() {
    super(new long[] {-1, 6}, new long[] {32, 96});
  }
}
