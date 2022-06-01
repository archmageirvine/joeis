package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097730 Pell equation solutions (6*b(n))^2 - 37*a(n)^2 = -1 with b(n)=A097729(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097730() {
    super(new long[] {-1, 146}, new long[] {1, 145});
  }
}
