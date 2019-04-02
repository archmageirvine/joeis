package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111571 a(n) = a(n-1) + a(n-3) + a(n-4), n &gt;= 4.
 * @author Sean A. Irvine
 */
public class A111571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111571() {
    super(new long[] {1, 1, 0, 1}, new long[] {1, 1, -2, -1});
  }
}
