package irvine.oeis.a013;

import irvine.oeis.LinearRecurrence;

/**
 * A013979 Expansion of 1/(1 - x^2 - x^3 - x^4) = 1/((1 + x)*(1 - x - x^3)).
 * @author Sean A. Irvine
 */
public class A013979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013979() {
    super(new long[] {1, 1, 1, 0}, new long[] {1, 0, 1, 1});
  }
}
