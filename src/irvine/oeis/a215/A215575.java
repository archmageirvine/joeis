package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215575.
 * @author Sean A. Irvine
 */
public class A215575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215575() {
    super(new long[] {-7, -7, 7}, new long[] {3, 7, 35});
  }
}
