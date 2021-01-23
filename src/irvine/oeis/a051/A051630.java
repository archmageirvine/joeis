package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051630 Poincar\u00e9 series [or Poincare series] (or Molien series) for Gamma_2(1,2)_(2).
 * @author Sean A. Irvine
 */
public class A051630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051630() {
    super(new long[] {-1, 1, 1, 0, -1, -1, 2, -1, -1, 0, 1, 1}, new long[] {1, 0, 2, 2, 4, 5, 9, 9, 15, 17, 23, 27});
  }
}
