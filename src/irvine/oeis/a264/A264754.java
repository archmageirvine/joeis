package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264754 Expansion of (1 + 2*x - 2*x^3 + x^4)/((1 - x)^3*(1 + x)^2).
 * @author Sean A. Irvine
 */
public class A264754 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264754() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 3, 5, 7, 11});
  }
}
