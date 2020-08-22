package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233522 Expansion of 1 / (1 - x - x^4 + x^9) in powers of x.
 * @author Sean A. Irvine
 */
public class A233522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233522() {
    super(new long[] {-1, 0, 0, 0, 0, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 3, 4, 5, 7});
  }
}
