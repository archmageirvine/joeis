package irvine.oeis.a266;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A266745 Expansion of 1/((1-t^5)^2*(1-t)*(1-t^3)*(1-t^7)*(1-t^9)).
 * @author Sean A. Irvine
 */
public class A266745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266745() {
    super(new long[] {-1, 1, 0, 1, -1, 2, -2, 1, -3, 3, -3, 2, -3, 4, -3, 4, -3, 4, -3, 2, -3, 3, -3, 1, -2, 2, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 4, 5, 6, 8, 10, 14, 16, 20, 24, 29, 37, 42, 50, 59, 69, 82, 94, 108, 124, 143, 164, 185, 210, 237, 267});
  }
}
