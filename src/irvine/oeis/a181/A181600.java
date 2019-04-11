package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181600 Expansion of <code>1/(1 - x - x^2 + x^8 - x^10)</code>.
 * @author Sean A. Irvine
 */
public class A181600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181600() {
    super(new long[] {1, 0, -1, 0, 0, 0, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 8, 13, 21, 33, 53});
  }
}
