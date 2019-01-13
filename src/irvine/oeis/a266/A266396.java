package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266396.
 * @author Sean A. Irvine
 */
public class A266396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266396() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 10, 41});
  }
}
