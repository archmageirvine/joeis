package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029152 Expansion of <code>1/((1-x^2)(1-x^3)(1-x^6)(1-x^9))</code>.
 * @author Sean A. Irvine
 */
public class A029152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029152() {
    super(new long[] {-1, 0, 1, 1, 0, -1, 1, 0, -1, 0, 0, 0, -1, 0, 1, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 3, 1, 3, 4, 3, 4, 7, 4, 7, 9, 7, 9, 14, 9});
  }
}
