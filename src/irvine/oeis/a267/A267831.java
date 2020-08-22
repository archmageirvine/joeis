package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267831 Expansion of (1 + 5*x - 7*x^2 - 3*x^3)/((1 - x)*(1 + x^2)^2).
 * @author Sean A. Irvine
 */
public class A267831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267831() {
    super(new long[] {1, -1, 2, -2, 1}, new long[] {1, 6, -3, -16, 1});
  }
}
