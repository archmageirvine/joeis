package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217602 Let a(1) = 1. If n and a(n-1) have the same parity, a(n) =  n + a(n-1), otherwise a(n) = abs(n - a(n-1)).
 * @author Sean A. Irvine
 */
public class A217602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217602() {
    super(new long[] {-1, 1, -1, 1, 0, 0, 0, 0, 1, -1, 1}, new long[] {1, 1, 4, 8, 3, 3, 10, 18, 9, 1, 12});
  }
}
