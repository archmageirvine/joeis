package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123552 Expansion of 1/(1 - x - x^3 + x^5).
 * @author Sean A. Irvine
 */
public class A123552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123552() {
    super(new long[] {-1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3});
  }
}
