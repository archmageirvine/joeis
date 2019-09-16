package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097114 Expansion of <code>(1 + 8x - 42x^2 - 392x^3)/(1 - 99x^2 + 2450x^4)</code>.
 * @author Sean A. Irvine
 */
public class A097114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097114() {
    super(new long[] {-2450, 0, 99, 0}, new long[] {1, 8, 57, 400});
  }
}
