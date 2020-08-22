package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061506 a(n) = lcm(6n+2, 6n+4, 6n+6).
 * @author Sean A. Irvine
 */
public class A061506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061506() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {12, 120, 1008, 1320, 5460, 4896, 15960, 12144});
  }
}
