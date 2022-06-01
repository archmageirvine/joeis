package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281584 Solutions x to the negative Pell equation x^2 - 15*y^2 = -11 with x, y &gt; 0.
 * @author Sean A. Irvine
 */
public class A281584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281584() {
    super(new long[] {-1, 0, 8, 0}, new long[] {2, 7, 23, 58});
  }
}
