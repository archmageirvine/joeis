package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093041 Expansion of (1-4x+6x^2-3x^3)/(1-5x+9x^2-8x^3+4x^4).
 * @author Sean A. Irvine
 */
public class A093041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093041() {
    super(new long[] {-4, 8, -9, 5}, new long[] {1, 1, 2, 6});
  }
}
