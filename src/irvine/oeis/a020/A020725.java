package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020725 Integers &gt;= 2. a(n) = n+1.
 * @author Sean A. Irvine
 */
public class A020725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020725() {
    super(1, new long[] {-1, 2}, new long[] {2, 3});
  }
}
