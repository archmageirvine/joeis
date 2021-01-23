package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071100 Expansion of (5 + 3*x + x^2 - x^3) / (1 - 2*x - 2*x^2 - 2*x^3 + x^4) in powers of x.
 * @author Sean A. Irvine
 */
public class A071100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071100() {
    super(new long[] {-1, 2, 2, 2}, new long[] {5, 13, 37, 109});
  }
}
