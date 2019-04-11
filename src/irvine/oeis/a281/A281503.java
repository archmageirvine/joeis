package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281503 Solutions x to the negative Pell equation y^2 <code>= 33*x^2 - 8</code> with x,y <code>&gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A281503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281503() {
    super(new long[] {-1, 0, 46, 0}, new long[] {1, 3, 43, 137});
  }
}
