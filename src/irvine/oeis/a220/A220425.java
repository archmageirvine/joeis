package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220425 <code>a(n) = n^2 + 2*n + 2^n</code>.
 * @author Sean A. Irvine
 */
public class A220425 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220425() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 5, 12, 23});
  }
}
