package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054563.
 * @author Sean A. Irvine
 */
public class A054563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054563() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 6, 45, 190, 595, 1540});
  }
}
