package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029432 Expansion of <code>1/((1-x^7)(1-x^8)(1-x^9)(1-x^10))</code>.
 * @author Sean A. Irvine
 */
public class A029432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029432() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, -1, -1, -2, -1, -1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 2, 2, 2, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 2, 3, 3, 4, 4});
  }
}
