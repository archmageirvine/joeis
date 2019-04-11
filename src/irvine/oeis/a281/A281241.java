package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281241 Solutions x to the negative Pell equation y^2 <code>= 72*x^2 - 1331712</code> with x,y <code>&gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A281241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281241() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {136, 152, 264, 408, 648, 1432});
  }
}
