package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131750 Numbers that are both centered triangular and centered square.
 * @author Sean A. Irvine
 */
public class A131750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131750() {
    super(1, new long[] {1, -195, 195}, new long[] {1, 85, 16381});
  }
}
