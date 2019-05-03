package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281236 Solutions y to the negative Pell equation <code>y^2 = 72*x^2 - 332928</code> with x,y <code>&gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A281236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281236() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {0, 288, 960, 1632, 2688, 6048});
  }
}
