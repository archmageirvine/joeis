package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215602.
 * @author Sean A. Irvine
 */
public class A215602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215602() {
    super(new long[] {-1, 2, 2}, new long[] {2, 3, 12});
  }
}
