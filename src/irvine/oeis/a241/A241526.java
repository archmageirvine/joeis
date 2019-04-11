package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241526 Number of different positions in which a square with side length k, <code>1 &lt;=</code> k <code>&lt;= n - floor(n/3),</code> can be placed within a bi-symmetric triangle of 1 X 1 squares of height n.
 * @author Sean A. Irvine
 */
public class A241526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241526() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {2, 7, 16, 31, 53, 83});
  }
}
