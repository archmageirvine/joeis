package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029275 Expansion of <code>1/((1-x^3)(1-x^5)(1-x^6)(1-x^10))</code>.
 * @author Sean A. Irvine
 */
public class A029275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029275() {
    super(new long[] {-1, 0, 0, 1, 0, 1, 1, 0, -1, -1, 1, -1, 0, -1, 1, -1, -1, 0, 1, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 2, 0, 1, 2, 2, 2, 3, 2, 2, 5, 4, 3, 6, 4, 6, 8, 6, 7});
  }
}
