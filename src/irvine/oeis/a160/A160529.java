package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160529 a(1) = 1; for n&gt;1, a(n) = a(n-1) + d1 + d2 where d1 = 4 if n is even. d1 = 1 if n is odd, d2 = 15 if n mod 4 = 0, d2 = 0 if n mod 4 != 0.
 * @author Sean A. Irvine
 */
public class A160529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160529() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 5, 6, 25, 26});
  }
}
