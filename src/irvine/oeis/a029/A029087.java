package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029087 Expansion of <code>1/((1-x)*(1-x^5)*(1-x^6)*(1-x^9))</code>.
 * @author Sean A. Irvine
 */
public class A029087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029087() {
    super(new long[] {-1, 1, 0, 0, 0, 1, 0, -1, 0, 1, -1, -1, 1, 0, -1, 0, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 8, 10, 11, 12, 14, 15, 17});
  }
}
