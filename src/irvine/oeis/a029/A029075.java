package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029075 Expansion of <code>1/((1-x)(1-x^4)(1-x^7)(1-x^10))</code>.
 * @author Sean A. Irvine
 */
public class A029075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029075() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 0, 1, -1, 0, 1, -2, 1, 0, -1, 1, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 3, 4, 4, 5, 6, 7, 7, 9, 10, 11, 12, 14, 15, 17, 19});
  }
}
