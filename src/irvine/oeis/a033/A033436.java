package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033436 a(n) = ceiling( (3*n^2 - 4)/8 ).
 * @author Sean A. Irvine
 */
public class A033436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033436() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 0, 1, 3, 6, 9});
  }
}
