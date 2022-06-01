package irvine.oeis.a162;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A162899 Partial sums of [A052938(n)^2].
 * @author Sean A. Irvine
 */
public class A162899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162899() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 10, 14, 30, 39, 64});
  }
}
