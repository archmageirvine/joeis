package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191567 Four interlaced 2nd order polynomials: a(4*k) = k*(1+2*k); a(1+2*k) = 2*(1+2*k)*(3+2*k); a(2+4*k) = 4*(1+k)*(1+2*k).
 * @author Sean A. Irvine
 */
public class A191567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191567() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0, 3, 0, 0, 0}, new long[] {0, 6, 4, 30, 3, 70, 24, 126, 10, 198, 60, 286});
  }
}
