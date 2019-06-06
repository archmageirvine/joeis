package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171663 Expansion of <code>(1 + 4*x - 6*x^2 - 16*x^3 + 20*x^4)/((1-x)*(1-2*x)*(1+2*x)*(1-2*x^2))</code>.
 * @author Sean A. Irvine
 */
public class A171663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171663() {
    super(new long[] {8, -8, -6, 6, 1}, new long[] {1, 5, 5, 13, 25});
  }
}
