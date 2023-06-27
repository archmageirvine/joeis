package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007698 a(n) = 22*a(n-1) - 3*a(n-2) + 18*a(n-3) - 11*a(n-4). Deviates from A007699 at the 1403rd term.
 * @author Sean A. Irvine
 */
public class A007698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007698() {
    super(1, new long[] {-11, 18, -3, 22}, new long[] {10, 219, 4796, 105030});
  }
}

