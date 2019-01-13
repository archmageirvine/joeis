package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266725.
 * @author Sean A. Irvine
 */
public class A266725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266725() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 4, 5, 12});
  }
}
