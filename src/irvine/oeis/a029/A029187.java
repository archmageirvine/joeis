package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029187 Expansion of <code>1/((1-x^2)(1-x^4)(1-x^8)(1-x^11))</code>.
 * @author Sean A. Irvine
 */
public class A029187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029187() {
    super(new long[] {-1, 0, 1, 0, 1, 0, -1, 0, 1, 0, -1, 1, -1, -1, 1, -1, 0, 1, 0, -1, 0, 1, 0, 1, 0}, new long[] {1, 0, 1, 0, 2, 0, 2, 0, 4, 0, 4, 1, 6, 1, 6, 2, 9, 2, 9, 4, 12, 4, 13, 6, 17});
  }
}
