package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097726 Pell equation solutions (5*a(n))^2 - 26*b(n)^2 = -1 with b(n):=A097727(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097726() {
    super(new long[] {-1, 102}, new long[] {1, 103});
  }
}
