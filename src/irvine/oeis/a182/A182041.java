package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182041 Number of independent sets of nodes in C_5 X C_n (n &gt;= 1).
 * @author Sean A. Irvine
 */
public class A182041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182041() {
    super(new long[] {-1, 8, -7, -30, 10, 27, 4}, new long[] {11, 1, 81, 391, 3561, 25531, 199821});
  }
}
