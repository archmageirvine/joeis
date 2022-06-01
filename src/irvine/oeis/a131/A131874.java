package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131874 a(n) = (7*n^2 + 15*n + 2) / 2.
 * @author Sean A. Irvine
 */
public class A131874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131874() {
    super(new long[] {1, -3, 3}, new long[] {1, 12, 30});
  }
}
