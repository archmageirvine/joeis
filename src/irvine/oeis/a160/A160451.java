package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160451 (4/3)u(u^3+6*u^2+8u-3) where u=Floor[{3n+5)/2].
 * @author Sean A. Irvine
 */
public class A160451 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160451() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {1008, 2080, 6440, 10208, 22360, 31416, 57408, 75208, 122816});
  }
}
