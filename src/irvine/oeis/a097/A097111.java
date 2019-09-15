package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097111 Expansion of <code>(1+3x-2x^2-12x^3)/(1-9x^2+20x^4)</code>.
 * @author Sean A. Irvine
 */
public class A097111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097111() {
    super(new long[] {-20, 0, 9, 0}, new long[] {1, 3, 7, 15});
  }
}
