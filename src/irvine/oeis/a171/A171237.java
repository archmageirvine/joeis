package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171237 a(0)=2, a(1)=3, a(n) = 3 + a(n-1) + a(n-2) for n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A171237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171237() {
    super(new long[] {-1, 0, 2}, new long[] {2, 3, 8});
  }
}
