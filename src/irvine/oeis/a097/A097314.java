package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097314 Pell equation solutions (3*a(n))^2 - 10*b(n)^2 = -1 with b(n) = A097315(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097314() {
    super(new long[] {-1, 38}, new long[] {1, 39});
  }
}
