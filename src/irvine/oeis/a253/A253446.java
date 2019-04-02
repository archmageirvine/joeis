package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253446 Indices of centered heptagonal numbers (A069099) which are also centered octagonal numbers (A016754).
 * @author Sean A. Irvine
 */
public class A253446 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253446() {
    super(new long[] {1, -31, 31}, new long[] {1, 16, 465});
  }
}
