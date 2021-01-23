package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097767 Pell equation solutions (11*b(n))^2 - 122*a(n)^2 = -1 with b(n):=A097766(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097767() {
    super(new long[] {-1, 486}, new long[] {1, 485});
  }
}
