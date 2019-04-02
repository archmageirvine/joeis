package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134172 Expansion of x^2*(1+x)*(1-x+x^2) / ((1-x)^2*(1+x^2)^2).
 * @author Sean A. Irvine
 */
public class A134172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134172() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 0, 1, 2, 1, 1});
  }
}
