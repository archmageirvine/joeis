package irvine.oeis.a283;

import irvine.oeis.LinearRecurrence;

/**
 * A283442 a(n) = lcm(n,5) / gcd(n,5).
 * @author Sean A. Irvine
 */
public class A283442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283442() {
    super(new long[] {-1, 0, 0, 0, 0, 2, 0, 0, 0, 0}, new long[] {0, 5, 10, 15, 20, 1, 30, 35, 40, 45});
  }
}
