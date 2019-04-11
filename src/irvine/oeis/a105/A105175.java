package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105175 Numbers such that <code>71*(a(n)^2) + 71*a(n) + 1</code> is a square.
 * @author Sean A. Irvine
 */
public class A105175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105175() {
    super(new long[] {1, -1, -48441598, 48441598, 1}, new long[] {0, 0, 9235919, 14984879, 447402699579360L});
  }
}
