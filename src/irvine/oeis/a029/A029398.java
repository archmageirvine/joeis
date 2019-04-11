package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029398 Expansion of <code>1/((1-x^5)(1-x^7)(1-x^9)(1-x^11))</code>.
 * @author Sean A. Irvine
 */
public class A029398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029398() {
    super(new long[] {-1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, -1, 0, -1, 0, -2, 0, -1, 0, -1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 2, 1, 2, 1, 2, 2, 2, 3, 2, 3, 2, 4, 3, 4, 4, 4, 5, 4});
  }
}
