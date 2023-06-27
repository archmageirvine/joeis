package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217529 a(n) = 2^(n-4)*(4*n^2 - 16*n + 23).
 * @author Sean A. Irvine
 */
public class A217529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217529() {
    super(4, new long[] {8, -12, 6}, new long[] {23, 86, 284});
  }
}
