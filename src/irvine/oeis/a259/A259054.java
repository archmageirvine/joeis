package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259054 a(n) = 4*n^2 - 4*n + 19, n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A259054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259054() {
    super(new long[] {1, -3, 3}, new long[] {19, 27, 43});
  }
}
