package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215149 a(n) = n * (1 + 2^(n-1)).
 * @author Sean A. Irvine
 */
public class A215149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215149() {
    super(new long[] {-4, 12, -13, 6}, new long[] {0, 2, 6, 15});
  }
}
