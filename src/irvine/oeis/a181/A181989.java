package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181989 Number of independent sets of nodes in graph C_5 x P_n <code>(n &gt;= 0)</code>.
 * @author Sean A. Irvine
 */
public class A181989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181989() {
    super(new long[] {-1, 5, 7}, new long[] {1, 11, 81});
  }
}
