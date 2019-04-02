package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215109 a(n) = A215082(2*n+1).
 * @author Sean A. Irvine
 */
public class A215109 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215109() {
    super(new long[] {-1, -3, -2, 1, 2, 1}, new long[] {1, 3, 5, 12, 23, 43});
  }
}
