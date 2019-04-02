package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038340 Second line of 5-wave sequence A038201.
 * @author Sean A. Irvine
 */
public class A038340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038340() {
    super(new long[] {1, 0, -9, 0, 28, 0, -35, 0, 15, 0}, new long[] {1, 4, 9, 50, 105, 616, 1287, 7601, 15873, 93819});
  }
}
