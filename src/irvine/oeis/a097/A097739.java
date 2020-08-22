package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097739 Pell equation solutions (9*b(n))^2 - 82*a(n)^2 = -1 with b(n):=A097738(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097739() {
    super(new long[] {-1, 326}, new long[] {1, 325});
  }
}
