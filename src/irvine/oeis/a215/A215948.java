package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215948.
 * @author Sean A. Irvine
 */
public class A215948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215948() {
    super(new long[] {3, -27, 33}, new long[] {3, 33, 1035});
  }
}
