package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029085 Expansion of <code>1/((1-x)(1-x^5)(1-x^6)(1-x^7))</code>.
 * @author Sean A. Irvine
 */
public class A029085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029085() {
    super(new long[] {-1, 1, 0, 0, 0, 1, 0, 0, -1, 0, 0, -1, 0, 0, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 3, 4, 4, 4, 5, 6, 8, 9, 10, 11, 12, 14, 16});
  }
}
