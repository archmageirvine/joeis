package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029360 Expansion of <code>1/((1-x^4)(1-x^7)(1-x^8)(1-x^10))</code>.
 * @author Sean A. Irvine
 */
public class A029360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029360() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, -1, -1, 0, -1, -1, 0, -1, -1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 0, 1, 2, 0, 1, 1, 2, 0, 2, 2, 3, 1, 3, 2, 4, 2, 4, 3, 6, 3, 5, 4, 8});
  }
}
