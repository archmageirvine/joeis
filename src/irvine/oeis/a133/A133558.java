package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133558 a(n) = a(n-1) + 9*a(n-2) for n &gt;= 2, a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A133558 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133558() {
    super(new long[] {9, 1}, new long[] {1, 2});
  }
}
