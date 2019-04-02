package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105580 a(n+3) = a(n) - a(n+1) - a(n+2); a(0) = -5, a(1) = 6, a(2) = 0.
 * @author Sean A. Irvine
 */
public class A105580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105580() {
    super(new long[] {1, -1, -1}, new long[] {-5, 6, 0});
  }
}
