package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266616.
 * @author Sean A. Irvine
 */
public class A266616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266616() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {0, 3, 3, 4, 8, 3});
  }
}
