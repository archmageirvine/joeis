package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130724 <code>a(n) =</code> lcm(n,3) / gcd(n,3).
 * @author Sean A. Irvine
 */
public class A130724 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130724() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 3, 6, 1, 12, 15});
  }
}
