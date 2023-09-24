package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178146 a(n) is the number of distinct prime factors &lt;= 5 of n.
 * @author Sean A. Irvine
 */
public class A178146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178146() {
    super(1, new long[] {1, 2, 2, 1, 0, -1, -2, -2}, new long[] {0, 1, 1, 1, 1, 2, 0, 1});
  }
}
