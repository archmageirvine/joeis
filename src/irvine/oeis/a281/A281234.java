package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281234 Solutions y to the negative Pell equation y^2 = 72*x^2 - 288 with x,y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A281234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281234() {
    super(new long[] {-1, 6}, new long[] {0, 48});
  }
}
