package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253621 Indices of centered heptagonal numbers (A069099) which are also centered pentagonal numbers (A005891).
 * @author Sean A. Irvine
 */
public class A253621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253621() {
    super(new long[] {1, -13, 13}, new long[] {1, 6, 66});
  }
}
