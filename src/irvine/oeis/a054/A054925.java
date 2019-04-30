package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054925 <code>a(n) = ceiling(n*(n-1)/4)</code>.
 * @author Sean A. Irvine
 */
public class A054925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054925() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {0, 0, 1, 2, 3});
  }
}
