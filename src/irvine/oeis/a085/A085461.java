package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085461 Number of 5-tuples (v1,v2,v3,v4,v5) of nonnegative integers less than n such that v1 &lt;= v5, v2 &lt;= v5, v2 &lt;= v4 and v3 &lt;= v4.
 * @author Sean A. Irvine
 */
public class A085461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085461() {
    super(1, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 13, 70, 246, 671, 1547});
  }
}
