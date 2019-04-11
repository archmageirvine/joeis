package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029090 Expansion of <code>1/((1-x)(1-x^5)(1-x^6)(1-x^12))</code>.
 * @author Sean A. Irvine
 */
public class A029090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029090() {
    super(new long[] {-1, 1, 0, 0, 0, 1, 0, -1, 0, 0, 0, -1, 2, -1, 0, 0, 0, -1, 0, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 4, 5, 7, 7, 7, 8, 9, 11, 13, 13, 14, 15, 17, 19});
  }
}
