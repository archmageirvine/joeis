package irvine.oeis.a283;

import irvine.oeis.LinearRecurrence;

/**
 * A283444 <code>a(n) =</code> lcm(n,7) / gcd(n,7).
 * @author Sean A. Irvine
 */
public class A283444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283444() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0}, new long[] {0, 7, 14, 21, 28, 35, 42, 1, 56, 63, 70, 77, 84, 91});
  }
}
