package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266614.
 * @author Sean A. Irvine
 */
public class A266614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266614() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, 0, 2, 3, 1, 8});
  }
}
