package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157112 a(n) = 5651522*n^2 - 8761372*n + 3395619.
 * @author Sean A. Irvine
 */
public class A157112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157112() {
    super(1, new long[] {1, -3, 3}, new long[] {285769, 8478963, 27975201});
  }
}
