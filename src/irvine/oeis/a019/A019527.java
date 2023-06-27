package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019527 Poincar\u00e9 series [or Poincare series] for depths of roots in a certain root system.
 * @author Sean A. Irvine
 */
public class A019527 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019527() {
    super(1, new long[] {0, -1, 1, -1, 2}, new long[] {4, 4, 5, 6, 8});
  }
}
