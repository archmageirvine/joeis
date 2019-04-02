package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121963 Expansion of x^2*(1 + 2*x + 7*x^2 - 3*x^3 + x^4) / (1 - 26*x^3 - x^6).
 * @author Sean A. Irvine
 */
public class A121963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121963() {
    super(new long[] {1, 0, 0, 26, 0, 0}, new long[] {0, 1, 2, 7, 23, 53});
  }
}
