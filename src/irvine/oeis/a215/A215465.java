package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215465.
 * @author Sean A. Irvine
 */
public class A215465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215465() {
    super(new long[] {-1, 10, -23, 10}, new long[] {0, 1, 10, 76});
  }
}
