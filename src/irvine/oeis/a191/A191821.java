package irvine.oeis.a191;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A191821 a(n) = n*(2^n - n + 1) + 2^(n-1)*(n^2 - 3*n + 2).
 * @author Sean A. Irvine
 */
public class A191821 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191821() {
    super(new long[] {-8, 36, -66, 63, -33, 9}, new long[] {2, 6, 26, 100, 332, 994});
  }
}
