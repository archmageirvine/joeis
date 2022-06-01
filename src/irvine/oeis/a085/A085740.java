package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085740 a(n) = T(n)^2 - n^2, where T(n) is a triangular number.
 * @author Sean A. Irvine
 */
public class A085740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085740() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 5, 27, 84});
  }
}
