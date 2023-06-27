package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257940 y-values in the solutions to x^2 + x = 5*y^2 + y.
 * @author Sean A. Irvine
 */
public class A257940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257940() {
    super(1, new long[] {1, -1, -322, 322, 1}, new long[] {0, 1, 52, 357, 16776});
  }
}
