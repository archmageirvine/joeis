package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053311 Partial sums of A000285.
 * @author Sean A. Irvine
 */
public class A053311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053311() {
    super(new long[] {-1, 0, 2}, new long[] {1, 5, 10});
  }
}
