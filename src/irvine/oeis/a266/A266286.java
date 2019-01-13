package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266286.
 * @author Sean A. Irvine
 */
public class A266286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266286() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 2, 3, 3});
  }
}
