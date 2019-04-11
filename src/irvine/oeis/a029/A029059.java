package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029059 Expansion of <code>1/((1-x)*(1-x^3)*(1-x^9)*(1-x^11))</code>.
 * @author Sean A. Irvine
 */
public class A029059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029059() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 0, 0, 0, 1, -1, 1, -2, 1, -1, 1, 0, 0, 0, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 3, 3, 3, 5, 5, 6, 8, 8, 9, 11, 11, 12, 15, 15, 17, 20, 21, 23});
  }
}
