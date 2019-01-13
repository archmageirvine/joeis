package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266176.
 * @author Sean A. Irvine
 */
public class A266176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266176() {
    super(new long[] {64, 0, -84, 0, 21, 0}, new long[] {1, 2, 4, 107, 16, 1967});
  }
}
