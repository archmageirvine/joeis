package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254285 Hexagonal numbers (A000384) which are also centered triangular numbers (A005448).
 * @author Sean A. Irvine
 */
public class A254285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254285() {
    super(1, new long[] {1, -1, -37634, 37634, 1}, new long[] {1, 1891, 26335, 71156485, 991081981});
  }
}
