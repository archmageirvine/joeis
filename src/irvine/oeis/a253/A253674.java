package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253674 Indices of centered octagonal numbers (A016754) which are also centered triangular numbers (A005448).
 * @author Sean A. Irvine
 */
public class A253674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253674() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {1, 10, 40, 931, 3871});
  }
}
