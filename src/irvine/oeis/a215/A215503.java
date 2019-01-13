package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215503.
 * @author Sean A. Irvine
 */
public class A215503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215503() {
    super(new long[] {-1, 5, 1, -17, -5, 9, 1}, new long[] {7, 1, 19, 13, 111, 121, 763});
  }
}
