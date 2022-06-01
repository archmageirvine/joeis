package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097735 Pell equation solutions (8*a(n))^2 - 65*b(n)^2 = -1 with b(n):=A097736(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097735() {
    super(new long[] {-1, 258}, new long[] {1, 259});
  }
}
