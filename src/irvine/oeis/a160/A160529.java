package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160529 <code>a(1) = 1</code>; for <code>n&gt;1, a(n) = a(n-1) + d1 + d2</code> where <code>d1 = 4</code> if n is even. <code>d1 = 1</code> if n is odd, <code>d2 = 15</code> if <code>n mod 4 = 0, d2 = 0</code> if <code>n mod 4 != 0</code>.
 * @author Sean A. Irvine
 */
public class A160529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160529() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 5, 6, 25, 26});
  }
}
