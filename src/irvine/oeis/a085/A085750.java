package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085750 Determinant of the symmetric n X n matrix A defined by A[i,j] = |i-j| for 1 &lt;= i,j &lt;= n.
 * @author Sean A. Irvine
 */
public class A085750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085750() {
    super(new long[] {-4, -4}, new long[] {0, -1});
  }
}
