package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249483 Squares (A000290) which are also centered triangular numbers (A005448).
 * @author Sean A. Irvine
 */
public class A249483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249483() {
    super(1, new long[] {1, -1, -98, 98, 1}, new long[] {1, 4, 64, 361, 6241});
  }
}
