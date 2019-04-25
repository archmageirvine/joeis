package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162959 The pairs <code>(x,y)</code> such that <code>(x^2 + y^2)/(x*y + 1)</code> is a perfect square, i.e., 4.
 * @author Sean A. Irvine
 */
public class A162959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162959() {
    super(new long[] {-1, 0, 4, 0}, new long[] {0, 2, 2, 8});
  }
}
