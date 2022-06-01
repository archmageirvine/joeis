package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097729 Pell equation solutions (6*a(n))^2 - 37*b(n)^2 = -1 with b(n):=A097730(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097729() {
    super(new long[] {-1, 146}, new long[] {1, 147});
  }
}
