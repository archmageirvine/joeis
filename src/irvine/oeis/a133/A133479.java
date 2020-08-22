package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133479 a(n) = a(n-1) + 8*a(n-2) for n &gt;= 2, a(0)=1, a(1)=2.
 * @author Sean A. Irvine
 */
public class A133479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133479() {
    super(new long[] {8, 1}, new long[] {1, 2});
  }
}
