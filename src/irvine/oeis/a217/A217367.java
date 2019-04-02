package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217367 a(n) = (n+7) / gcd(n+7,4) * n / gcd(n,4).
 * @author Sean A. Irvine
 */
public class A217367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217367() {
    super(new long[] {1, -3, 6, -10, 12, -12, 10, -6, 3}, new long[] {0, 2, 9, 15, 11, 15, 39, 49, 30});
  }
}
