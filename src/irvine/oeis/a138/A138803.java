package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138803.
 * @author Sean A. Irvine
 */
public class A138803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138803() {
    super(new long[] {-1, 0, -4, 4}, new long[] {0, 1, 3, 8});
  }
}
