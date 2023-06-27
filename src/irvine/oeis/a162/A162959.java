package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162959 The pairs (x,y) such that (x^2 + y^2)/(x*y + 1) is a perfect square, i.e., 4.
 * @author Sean A. Irvine
 */
public class A162959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162959() {
    super(1, new long[] {-1, 0, 4, 0}, new long[] {0, 2, 2, 8});
  }
}
