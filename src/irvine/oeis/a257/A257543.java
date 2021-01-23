package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257543 Expansion of 1 / (1 - x^5 - x^8 + x^9) in powers of x.
 * @author Sean A. Irvine
 */
public class A257543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257543() {
    super(new long[] {-1, 1, 0, 0, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1, 0, 0, 1});
  }
}
