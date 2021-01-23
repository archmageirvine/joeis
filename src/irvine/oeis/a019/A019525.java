package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019525 Poincar\u00e9 series [or Poincare series] for depths of roots in a certain root system.
 * @author Sean A. Irvine
 */
public class A019525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019525() {
    super(new long[] {-3, 2, 2}, new long[] {2, 3, 6});
  }
}
