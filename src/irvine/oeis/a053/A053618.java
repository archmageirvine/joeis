package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053618 a(n) = ceiling(binomial(n,4)/n).
 * @author Sean A. Irvine
 */
public class A053618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053618() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 1, -3, 3}, new long[] {0, 0, 0, 1, 1, 3, 5, 9, 14, 21, 30});
  }
}
