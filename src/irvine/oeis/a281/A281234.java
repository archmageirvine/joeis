package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281234 Solutions y to the negative Pell equation <code>y^2 = 72*x^2 - 288</code> with x,y <code>&gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A281234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281234() {
    super(new long[] {-1, 6}, new long[] {0, 48});
  }
}
