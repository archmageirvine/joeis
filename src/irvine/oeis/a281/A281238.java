package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281238 Solutions y to the negative Pell equation y^2 <code>= 72*x^2 - 73728</code> with x,y <code>&gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A281238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281238() {
    super(new long[] {-1, 6}, new long[] {0, 768});
  }
}
