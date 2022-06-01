package irvine.oeis.a270;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270889 Integers n such that the circular graph C_n has a square size deficiency.
 * @author Sean A. Irvine
 */
public class A270889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270889() {
    super(new long[] {1, -7, 7}, new long[] {3, 6, 27});
  }
}
