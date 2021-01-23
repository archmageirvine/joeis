package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097736 Pell equation solutions (8*b(n))^2 - 65*a(n)^2 = -1 with b(n):=A097735(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097736() {
    super(new long[] {-1, 258}, new long[] {1, 257});
  }
}
