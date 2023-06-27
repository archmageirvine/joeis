package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253477 Indices of centered heptagonal numbers (A069099) which are also centered triangular numbers (A005448).
 * @author Sean A. Irvine
 */
public class A253477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253477() {
    super(1, new long[] {1, -1, -110, 110, 1}, new long[] {1, 10, 46, 1045, 5005});
  }
}
