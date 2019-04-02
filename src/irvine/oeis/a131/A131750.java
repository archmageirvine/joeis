package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131750 Numbers that are both centered triangular and centered square.
 * @author Sean A. Irvine
 */
public class A131750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131750() {
    super(new long[] {1, -195, 195}, new long[] {1, 85, 16381});
  }
}
