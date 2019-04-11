package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029185 Expansion of <code>1/((1-x^2)(1-x^4)(1-x^7)(1-x^12))</code>.
 * @author Sean A. Irvine
 */
public class A029185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029185() {
    super(new long[] {-1, 0, 1, 0, 1, 0, -1, 1, 0, -1, 0, -1, 1, 1, -1, 0, -1, 0, 1, -1, 0, 1, 0, 1, 0}, new long[] {1, 0, 1, 0, 2, 0, 2, 1, 3, 1, 3, 2, 5, 2, 6, 3, 8, 3, 9, 5, 11, 6, 12, 8, 15});
  }
}
