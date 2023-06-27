package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253458 Indices of centered heptagonal numbers (A069099) which are also centered hexagonal numbers (A003215).
 * @author Sean A. Irvine
 */
public class A253458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253458() {
    super(1, new long[] {1, -27, 27}, new long[] {1, 13, 325});
  }
}
