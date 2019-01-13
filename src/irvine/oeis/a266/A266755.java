package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266755.
 * @author Sean A. Irvine
 */
public class A266755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266755() {
    super(new long[] {1, 0, -1, -1, -1, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 1, 3, 2, 4});
  }
}
