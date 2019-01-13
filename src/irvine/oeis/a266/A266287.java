package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266287.
 * @author Sean A. Irvine
 */
public class A266287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266287() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 5, 8, 14});
  }
}
