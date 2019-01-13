package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266285.
 * @author Sean A. Irvine
 */
public class A266285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266285() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 1, 2, 4});
  }
}
