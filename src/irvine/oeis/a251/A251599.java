package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251599 Centers of rows of the triangular array formed by the natural numbers.
 * @author Sean A. Irvine
 */
public class A251599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251599() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 2, 3, 5, 8, 9, 13});
  }
}
