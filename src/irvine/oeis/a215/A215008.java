package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215008.
 * @author Sean A. Irvine
 */
public class A215008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215008() {
    super(new long[] {7, -14, 7}, new long[] {0, 1, 5});
  }
}
