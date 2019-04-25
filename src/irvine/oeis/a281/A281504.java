package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281504 Solutions y to the negative Pell equation <code>y^2 = 33*x^2 - 8</code> with <code>x,y &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A281504 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281504() {
    super(new long[] {-1, 0, 46, 0}, new long[] {5, 17, 247, 787});
  }
}
