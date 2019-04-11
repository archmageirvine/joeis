package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037251 <code>a(n) = n^3*(n^3 + 1)*(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A037251 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037251() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 72, 1512, 12480, 63000, 234360, 707952});
  }
}
