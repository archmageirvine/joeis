package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029030 Expansion of <code>1/((1-x)(1-x^2)(1-x^10)(1-x^11))</code>.
 * @author Sean A. Irvine
 */
public class A029030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029030() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 0, 0, 0, 0, 1, 0, -2, 0, 1, 0, 0, 0, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 7, 8, 10, 11, 13, 14, 16, 17, 19, 20, 23, 25, 29, 31});
  }
}
