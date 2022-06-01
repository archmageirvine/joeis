package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108368 Coefficients of x/(1-3*x-3*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A108368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108368() {
    super(new long[] {1, 3, 3}, new long[] {0, 1, 3});
  }
}
