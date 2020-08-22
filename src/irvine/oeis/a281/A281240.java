package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281240 Solutions y to the negative Pell equation y^2 = 72*x^2 - 83232 with x,y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A281240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281240() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {0, 144, 480, 816, 1344, 3024});
  }
}
