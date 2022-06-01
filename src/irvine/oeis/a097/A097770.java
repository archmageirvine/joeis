package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097770 Pell equation solutions (12*b(n))^2 - 145*a(n)^2 = -1 with b(n)=A097769(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097770() {
    super(new long[] {-1, 578}, new long[] {1, 577});
  }
}
