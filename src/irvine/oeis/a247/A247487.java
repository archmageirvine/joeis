package irvine.oeis.a247;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A247487 Expansion of (2 + x + x^2 + x^3 - x^4 - 2*x^5 - 4*x^6 - 8*x^7) / (1 - x^4 + 16*x^8) in powers of x.
 * @author Sean A. Irvine
 */
public class A247487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247487() {
    super(new long[] {-16, 0, 0, 0, 1, 0, 0, 0}, new long[] {2, 1, 1, 1, 1, -1, -3, -7});
  }
}
