package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167708 Numbers k such that <code>(k^2 - 81)/19</code> is a square.
 * @author Sean A. Irvine
 */
public class A167708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167708() {
    super(new long[] {-1, 0, 0, 0, 0, 340, 0, 0, 0, 0}, new long[] {9, 10, 66, 105, 959, 1530, 2441, 22335, 35634, 326050});
  }
}
