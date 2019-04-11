package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029122 Expansion of <code>1/((1-x)(1-x^7)(1-x^9)(1-x^11))</code>.
 * @author Sean A. Irvine
 */
public class A029122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029122() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1, -1, 1, -1, 1, -1, 0, 0, 0, -1, 1, -1, 1, -1, 1, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 8, 8, 9, 10, 11, 12, 12, 14, 14, 16});
  }
}
