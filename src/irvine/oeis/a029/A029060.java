package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029060 Expansion of <code>1/((1-x)*(1-x^3)*(1-x^10)*(1-x^11))</code>.
 * @author Sean A. Irvine
 */
public class A029060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029060() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 0, 0, 0, 0, 1, 0, -1, -1, 0, 1, 0, 0, 0, 0, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 18, 20, 22, 24});
  }
}
