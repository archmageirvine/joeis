package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020725 Integers <code>&gt;= 2. a(n) = n+1</code>.
 * @author Sean A. Irvine
 */
public class A020725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020725() {
    super(new long[] {-1, 2}, new long[] {2, 3});
  }
}
