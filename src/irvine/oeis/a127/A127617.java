package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127617 Number of walks from (0,0) to (n,n) in the region 0 &lt;= x-y &lt;= 3 with the steps (1,0), (0, 1), (2,0) and (0,2).
 * @author Sean A. Irvine
 */
public class A127617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127617() {
    super(new long[] {-1, 2, 5, 3}, new long[] {1, 1, 5, 22});
  }
}
