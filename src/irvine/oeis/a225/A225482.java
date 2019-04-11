package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225482 Expansion of <code>1/(1 - x^3 - x^4 - x^5 + x^8)</code>.
 * @author Sean A. Irvine
 */
public class A225482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225482() {
    super(new long[] {-1, 0, 0, 1, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 1, 1, 2});
  }
}
