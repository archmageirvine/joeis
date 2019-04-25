package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281239 Solutions x to the negative Pell equation <code>y^2 = 72*x^2 - 83232</code> with <code>x,y &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A281239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281239() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {34, 38, 66, 102, 162, 358});
  }
}
