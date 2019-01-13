package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266387.
 * @author Sean A. Irvine
 */
public class A266387 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266387() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 0, 0, 0, 0, 7});
  }
}
