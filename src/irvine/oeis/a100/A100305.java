package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100305 Expansion of <code>(1-x-4x^2)/(1-2x-7x^2+8x^3)</code>.
 * @author Sean A. Irvine
 */
public class A100305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100305() {
    super(new long[] {-8, 7, 2}, new long[] {1, 1, 5});
  }
}
