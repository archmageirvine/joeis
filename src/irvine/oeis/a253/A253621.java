package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253621 Indices of centered heptagonal numbers <code>(A069099)</code> which are also centered pentagonal numbers <code>(A005891)</code>.
 * @author Sean A. Irvine
 */
public class A253621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253621() {
    super(new long[] {1, -13, 13}, new long[] {1, 6, 66});
  }
}
