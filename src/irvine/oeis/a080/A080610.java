package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080610 Partial sums of Jacobsthal gap sequence.
 * @author Sean A. Irvine
 */
public class A080610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080610() {
    super(new long[] {-4, 0, 5, 0}, new long[] {0, 1, 4, 5});
  }
}
