package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051375 Number of Boolean functions of n variables and rank 3 from Post class F(5,inf).
 * @author Sean A. Irvine
 */
public class A051375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051375() {
    super(1, new long[] {-24, 50, -35, 10}, new long[] {0, 0, 9, 66});
  }
}
