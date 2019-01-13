package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266398.
 * @author Sean A. Irvine
 */
public class A266398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266398() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 12, 37});
  }
}
