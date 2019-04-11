package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029022 Expansion of <code>1/((1-x)(1-x^2)(1-x^7)(1-x^10))</code>.
 * @author Sean A. Irvine
 */
public class A029022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029022() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 0, 1, -1, -1, 2, -1, -1, 1, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 9, 10, 12, 13, 16, 17, 20, 22, 25, 27});
  }
}
