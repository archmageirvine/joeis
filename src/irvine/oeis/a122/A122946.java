package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122946 a(0)=a(1)=0, a(2)=2; for n &gt;= 3, a(n) = a(n-1) + 4*a(n-3).
 * @author Sean A. Irvine
 */
public class A122946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122946() {
    super(new long[] {4, 0, 1}, new long[] {0, 0, 2});
  }
}
