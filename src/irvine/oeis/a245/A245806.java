package irvine.oeis.a245;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A245806 a(n) = 3^n + 10^n.
 * @author Sean A. Irvine
 */
public class A245806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245806() {
    super(new long[] {-30, 13}, new long[] {2, 13});
  }
}
