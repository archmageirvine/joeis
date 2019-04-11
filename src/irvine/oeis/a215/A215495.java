package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215495 <code>a(4*n) = a(4*n+2) = a(2*n+1) = 2*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A215495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215495() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, 1, 1, 3, 3, 5});
  }
}
