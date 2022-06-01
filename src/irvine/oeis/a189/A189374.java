package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189374 Expansion of 1/((1-x)^5*(x^2+x+1)^3).
 * @author Sean A. Irvine
 */
public class A189374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189374() {
    super(new long[] {1, -2, 1, -3, 6, -3, 3, -6, 3, -1, 2}, new long[] {1, 2, 3, 7, 11, 15, 25, 35, 45, 65, 85});
  }
}
