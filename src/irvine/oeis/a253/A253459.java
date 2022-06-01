package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253459 Indices of centered square numbers (A001844) which are also centered heptagonal numbers (A069099).
 * @author Sean A. Irvine
 */
public class A253459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253459() {
    super(new long[] {1, -1, -254, 254, 1}, new long[] {1, 21, 148, 5208, 37465});
  }
}
