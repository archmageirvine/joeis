package irvine.oeis.a183;

import irvine.oeis.LinearRecurrence;

/**
 * A183871 <code>n + ceiling( (1/5)*n^2 )</code>; complement of <code>A183870</code>.
 * @author Sean A. Irvine
 */
public class A183871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A183871() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {2, 3, 5, 8, 10, 14, 17});
  }
}
