package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152895 Partial sums of A152891.
 * @author Sean A. Irvine
 */
public class A152895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152895() {
    super(new long[] {1, -6, 13, -13, 6}, new long[] {0, 2, 11, 40, 123});
  }
}
