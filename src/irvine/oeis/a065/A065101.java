package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065101 a(0) = c, a(1) = p*c^3; a(n+2) = p*c^2*a(n+1) - a(n), for p = 3, c = 2.
 * @author Sean A. Irvine
 */
public class A065101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065101() {
    super(new long[] {-1, 12}, new long[] {2, 24});
  }
}
