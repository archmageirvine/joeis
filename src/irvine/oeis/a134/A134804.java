package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134804 Remainder of triangular number A000217(n) modulo 9.
 * @author Sean A. Irvine
 */
public class A134804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134804() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 3, 6, 1, 6, 3, 1, 0});
  }
}
