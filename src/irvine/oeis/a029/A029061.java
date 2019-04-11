package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029061 Expansion of <code>1/((1-x)*(1-x^3)*(1-x^10)*(1-x^12))</code>.
 * @author Sean A. Irvine
 */
public class A029061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029061() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 0, 0, 0, 0, 1, -1, 1, -2, 1, -1, 1, 0, 0, 0, 0, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 5, 7, 8, 8, 10, 11, 11, 13, 14, 15, 17, 19, 20, 23, 25});
  }
}
