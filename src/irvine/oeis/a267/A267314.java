package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267314 Expansion of 2*x*(1 + 2*x - x^2)/((1 - x)*(1 + x^2)^2).
 * @author Sean A. Irvine
 */
public class A267314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267314() {
    super(new long[] {1, -1, 2, -2, 1}, new long[] {0, 2, 6, 0, -8});
  }
}
