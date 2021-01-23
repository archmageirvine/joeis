package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019528 Poincar\u00e9 series [or Poincare series] for depths of roots in a certain root system.
 * @author Sean A. Irvine
 */
public class A019528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019528() {
    super(new long[] {0, 0, -1, -1, -2, -1, 0, 2, 2, 1, 0}, new long[] {5, 5, 6, 8, 11, 16, 25, 38, 59, 93, 148});
  }
}
