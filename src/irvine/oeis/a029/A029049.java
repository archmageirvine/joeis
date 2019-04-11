package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029049 Expansion of <code>1/((1-x)(1-x^3)(1-x^7)(1-x^8))</code>.
 * @author Sean A. Irvine
 */
public class A029049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029049() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 0, 1, 0, -1, -1, 0, 1, 0, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20});
  }
}
