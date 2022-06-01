package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277978 a(n) = 3*n*(n+3).
 * @author Sean A. Irvine
 */
public class A277978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277978() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 30});
  }
}
