package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097110 Expansion of <code>(1 + 2x - 2x^3) / (1 - 3x^2 + 2x^4)</code>.
 * @author Sean A. Irvine
 */
public class A097110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097110() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 2, 3, 4});
  }
}
