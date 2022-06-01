package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253476 Indices of centered triangular numbers (A005448) which are also centered heptagonal numbers (A069099).
 * @author Sean A. Irvine
 */
public class A253476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253476() {
    super(new long[] {1, -1, -110, 110, 1}, new long[] {1, 15, 70, 1596, 7645});
  }
}
