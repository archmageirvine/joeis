package irvine.oeis.a220;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A220979 a(n) = 5^(4n+2) - 5^(3n+2) + 3 * 5^(2n+1) - 5^(n+1) + 1: the left Aurifeuillian factor of 5^(10n+5) - 1.
 * @author Sean A. Irvine
 */
public class A220979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220979() {
    super(new long[] {9765625, -12203125, 2538250, -101530, 781}, new long[] {11, 12851, 9384251, 6054921251L, 3808599606251L});
  }
}
