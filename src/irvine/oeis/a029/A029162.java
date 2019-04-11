package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029162 Expansion of <code>1/((1-x^2)(1-x^3)(1-x^8)(1-x^10))</code>.
 * @author Sean A. Irvine
 */
public class A029162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029162() {
    super(new long[] {-1, 0, 1, 1, 0, -1, 0, 0, 1, 0, 0, -1, -1, 0, 0, 1, 0, 0, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 2, 1, 3, 2, 4, 3, 5, 4, 6, 5, 8, 6, 10, 8, 12, 10, 14});
  }
}
