package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253879 Indices of centered heptagonal numbers (A069099) which are also triangular numbers (A000217).
 * @author Sean A. Irvine
 */
public class A253879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253879() {
    super(new long[] {1, -17, 17}, new long[] {1, 9, 136});
  }
}
