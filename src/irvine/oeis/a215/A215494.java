package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215494.
 * @author Sean A. Irvine
 */
public class A215494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215494() {
    super(new long[] {7, -14, 7}, new long[] {7, 21, 70});
  }
}
