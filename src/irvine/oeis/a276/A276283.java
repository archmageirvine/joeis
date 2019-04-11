package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276283 Expansion of <code>(1 + x + 3*x^2 + x^3)/((1 - x)^2*(1 + x^2))</code>.
 * @author Sean A. Irvine
 */
public class A276283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276283() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 3, 7, 11});
  }
}
