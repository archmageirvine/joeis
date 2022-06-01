package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019487 a(n) = 3*a(n-1) - a(n-2) + 2*a(n-3) - 2*a(n-4).
 * @author Sean A. Irvine
 */
public class A019487 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019487() {
    super(new long[] {-2, 2, -1, 3}, new long[] {2, 6, 17, 48});
  }
}
