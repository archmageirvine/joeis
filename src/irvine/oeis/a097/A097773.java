package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097773 Pell equation solutions (13*b(n))^2 - 170*a(n)^2 = -1 with b(n):=A097772(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097773() {
    super(new long[] {-1, 678}, new long[] {1, 677});
  }
}
