package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266397.
 * @author Sean A. Irvine
 */
public class A266397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266397() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 9, 31});
  }
}
