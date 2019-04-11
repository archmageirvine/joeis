package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220980 <code>5^(4n+2) + 5^(3n+2) + 3 * 5^(2n+1) + 5^(n+1) + 1</code>: the right Aurifeuillian factor of <code>5^(10n+5) - 1</code>.
 * @author Sean A. Irvine
 */
public class A220980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220980() {
    super(new long[] {9765625, -12203125, 2538250, -101530, 781}, new long[] {71, 19151, 10165751, 6152578751L, 3820806643751L});
  }
}
