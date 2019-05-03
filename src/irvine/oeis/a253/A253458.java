package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253458 Indices of centered heptagonal numbers <code>(A069099)</code> which are also centered hexagonal numbers <code>(A003215)</code>.
 * @author Sean A. Irvine
 */
public class A253458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253458() {
    super(new long[] {1, -27, 27}, new long[] {1, 13, 325});
  }
}
