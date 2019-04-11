package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042453 Denominators of continued fraction convergents to <code>sqrt(754)</code>.
 * @author Sean A. Irvine
 */
public class A042453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042453() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 40914, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 11, 13, 24, 37, 61, 342, 745, 40572, 81889, 450017, 531906, 981923, 1513829, 2495752, 13992589, 30480930});
  }
}
