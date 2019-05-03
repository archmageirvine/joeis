package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253476 Indices of centered triangular numbers <code>(A005448)</code> which are also centered heptagonal numbers <code>(A069099)</code>.
 * @author Sean A. Irvine
 */
public class A253476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253476() {
    super(new long[] {1, -1, -110, 110, 1}, new long[] {1, 15, 70, 1596, 7645});
  }
}
