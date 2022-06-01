package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087509 Number of k such that (k*n) == 2 (mod 3) for 0 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A087509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087509() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 0, 1, 0, 1, 2});
  }
}
