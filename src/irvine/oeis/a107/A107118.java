package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107118 Numbers that are both centered triangular numbers (A005448) and centered hexagonal numbers (A003215).
 * @author Sean A. Irvine
 */
public class A107118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107118() {
    super(1, new long[] {1, -35, 35}, new long[] {1, 19, 631});
  }
}
