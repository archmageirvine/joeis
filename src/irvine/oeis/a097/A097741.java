package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097741 Pell equation solutions (10*a(n))^2 - 101*b(n)^2 = -1 with b(n) = A097742(n), n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A097741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097741() {
    super(new long[] {-1, 402}, new long[] {1, 403});
  }
}
