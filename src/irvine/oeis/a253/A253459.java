package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253459 Indices of centered square numbers <code>(A001844)</code> which are also centered heptagonal numbers <code>(A069099)</code>.
 * @author Sean A. Irvine
 */
public class A253459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253459() {
    super(new long[] {1, -1, -254, 254, 1}, new long[] {1, 21, 148, 5208, 37465});
  }
}
