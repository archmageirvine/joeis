package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167478 Expansion of (1-2x+6x^2-x^3)/(1-3x+x^2)^2.
 * @author Sean A. Irvine
 */
public class A167478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167478() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 4, 19, 75});
  }
}
