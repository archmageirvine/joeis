package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053311 Partial sums of <code>A000285</code>.
 * @author Sean A. Irvine
 */
public class A053311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053311() {
    super(new long[] {-1, 0, 2}, new long[] {1, 5, 10});
  }
}
