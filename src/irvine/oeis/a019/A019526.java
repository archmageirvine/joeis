package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019526 Poincar\u00e9 series [or Poincare series] for depths of roots in a certain root system.
 * @author Sean A. Irvine
 */
public class A019526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019526() {
    super(1, new long[] {-1, 0, 0, 0, 2}, new long[] {4, 5, 8, 13, 24});
  }
}
