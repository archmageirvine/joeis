package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215510.
 * @author Sean A. Irvine
 */
public class A215510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215510() {
    super(new long[] {7, -14, 7}, new long[] {0, 7, 35});
  }
}
