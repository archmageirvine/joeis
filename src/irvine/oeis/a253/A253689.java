package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253689 Centered triangular numbers (A005448) which are also centered heptagonal numbers (A069099).
 * @author Sean A. Irvine
 */
public class A253689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253689() {
    super(1, new long[] {1, -1, -12098, 12098, 1}, new long[] {1, 316, 7246, 3818431, 87657571});
  }
}
