package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087508 Number of k such that <code>mod(k*n,3) = 1</code> for <code>0 &lt;= k &lt;= n</code>.
 * @author Sean A. Irvine
 */
public class A087508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087508() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {0, 1, 1, 0, 2, 2});
  }
}
