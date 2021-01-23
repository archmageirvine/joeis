package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097772 Pell equation solutions (13*a(n))^2 - 170*b(n)^2 = -1 with b(n):=A097771(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097772() {
    super(new long[] {-1, 678}, new long[] {1, 679});
  }
}
