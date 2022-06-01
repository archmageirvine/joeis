package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175005 Expansion of x/(1 - 4*x + 3*x^2 - 2*x^3).
 * @author Sean A. Irvine
 */
public class A175005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175005() {
    super(new long[] {2, -3, 4}, new long[] {0, 1, 4});
  }
}
