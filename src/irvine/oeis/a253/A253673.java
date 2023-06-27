package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253673 Indices of centered triangular numbers (A005448) that are also centered octagonal numbers (A016754).
 * @author Sean A. Irvine
 */
public class A253673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253673() {
    super(1, new long[] {1, -1, -98, 98, 1}, new long[] {1, 16, 65, 1520, 6321});
  }
}
