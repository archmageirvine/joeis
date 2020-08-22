package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176367 y-values in the solution to x^2 - 62*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A176367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176367() {
    super(new long[] {-1, 126}, new long[] {0, 8});
  }
}
