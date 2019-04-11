package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029357 Expansion of <code>1/((1-x^4)(1-x^6)(1-x^10)(1-x^11))</code>.
 * @author Sean A. Irvine
 */
public class A029357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029357() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, -1, -1, -1, -1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 1, 3, 1, 3, 1, 4, 2, 5, 2, 5, 2, 6, 3, 7, 3, 8});
  }
}
