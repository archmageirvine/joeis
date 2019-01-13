package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266461.
 * @author Sean A. Irvine
 */
public class A266461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266461() {
    super(new long[] {32, 0, -50, 0, 19, 0}, new long[] {1, 5, 2, 123, 4, 2039});
  }
}
