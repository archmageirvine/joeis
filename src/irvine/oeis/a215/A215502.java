package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215502.
 * @author Sean A. Irvine
 */
public class A215502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215502() {
    super(new long[] {-4, -2, 6, 1}, new long[] {4, 1, 13, 13});
  }
}
