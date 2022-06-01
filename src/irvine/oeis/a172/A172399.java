package irvine.oeis.a172;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A172399 Expansion of x^7/(1-2*x-2*x^2+x^3+x^8).
 * @author Sean A. Irvine
 */
public class A172399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172399() {
    super(new long[] {-1, 0, 0, 0, 0, -1, 2, 2}, new long[] {1, 2, 6, 15, 40, 104, 273, 714});
  }
}
