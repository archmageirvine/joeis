package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029045 Expansion of <code>1/((1-x)(1-x^3)(1-x^6)(1-x^7))</code>.
 * @author Sean A. Irvine
 */
public class A029045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029045() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 1, 0, -1, -1, 0, 1, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 4, 5, 5, 7, 8, 8, 11, 13, 14, 17, 19});
  }
}
