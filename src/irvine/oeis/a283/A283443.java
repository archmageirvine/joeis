package irvine.oeis.a283;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A283443 a(n) = lcm(n,6) / gcd(n,6).
 * @author Sean A. Irvine
 */
public class A283443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283443() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0}, new long[] {0, 6, 3, 2, 6, 30, 1, 42, 12, 6, 15, 66});
  }
}
