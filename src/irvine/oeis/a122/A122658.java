package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122658 a(n) = if n mod 2 = 1 then n^3*(n-1)^2/2 else n^5/2.
 * @author Sean A. Irvine
 */
public class A122658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122658() {
    super(new long[] {-1, 1, 5, -5, -10, 10, 10, -10, -5, 5, 1}, new long[] {0, 0, 16, 54, 512, 1000, 3888, 6174, 16384, 23328, 50000});
  }
}
