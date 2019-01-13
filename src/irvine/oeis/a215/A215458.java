package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215458.
 * @author Sean A. Irvine
 */
public class A215458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215458() {
    super(new long[] {-4, 8, -7, 4}, new long[] {0, 1, 4, 7});
  }
}
