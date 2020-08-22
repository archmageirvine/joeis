package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189375 Expansion of 1/((1-x)^5*(x^3+x^2+x+1)^3).
 * @author Sean A. Irvine
 */
public class A189375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189375() {
    super(new long[] {1, -2, 1, 0, -3, 6, -3, 0, 3, -6, 3, 0, -1, 2}, new long[] {1, 2, 3, 4, 8, 12, 16, 20, 30, 40, 50, 60, 80, 100});
  }
}
