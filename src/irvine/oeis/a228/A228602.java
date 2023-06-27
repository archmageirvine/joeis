package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228602 a(1) = 17, a(2) = 80, a(n) = 4*(a(n-1) + a(n-2)) for n &gt;= 3.
 * @author Sean A. Irvine
 */
public class A228602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228602() {
    super(1, new long[] {4, 4}, new long[] {17, 80});
  }
}
