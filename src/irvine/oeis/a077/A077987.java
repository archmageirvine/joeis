package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077987 Expansion of 1/(1+2*x-x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A077987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077987() {
    super(new long[] {-2, 1, -2}, new long[] {1, -2, 5});
  }
}
