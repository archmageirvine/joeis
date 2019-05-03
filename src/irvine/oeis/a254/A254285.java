package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254285 Hexagonal numbers <code>(A000384)</code> which are also centered triangular numbers <code>(A005448)</code>.
 * @author Sean A. Irvine
 */
public class A254285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254285() {
    super(new long[] {1, -1, -37634, 37634, 1}, new long[] {1, 1891, 26335, 71156485, 991081981});
  }
}
