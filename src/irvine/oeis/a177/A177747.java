package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177747 Convolution of A008805 (triangular numbers repeated) with itself.
 * @author Sean A. Irvine
 */
public class A177747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177747() {
    super(new long[] {-1, 2, 3, -8, -2, 12, -2, -8, 3, 2}, new long[] {1, 2, 7, 12, 27, 42, 77, 112, 182, 252});
  }
}
