package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215005.
 * @author Sean A. Irvine
 */
public class A215005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215005() {
    super(new long[] {1, 0, -3, 1, 2}, new long[] {0, 1, 3, 6, 12});
  }
}
