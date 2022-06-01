package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094633 A Lucas Jacobsthal product.
 * @author Sean A. Irvine
 */
public class A094633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094633() {
    super(new long[] {-4, 2, 7, 1}, new long[] {2, 1, 9, 20});
  }
}
