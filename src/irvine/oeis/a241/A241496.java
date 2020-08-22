package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241496 Expansion of (1 + 4*x + x^2) / (1 - x^2)^3.
 * @author Sean A. Irvine
 */
public class A241496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241496() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 4, 4, 12, 9, 24});
  }
}
