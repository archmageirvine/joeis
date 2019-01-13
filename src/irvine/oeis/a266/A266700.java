package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266700.
 * @author Sean A. Irvine
 */
public class A266700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266700() {
    super(new long[] {-1, 2, 2}, new long[] {0, -10, -12});
  }
}
