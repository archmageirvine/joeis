package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019298.
 * @author Sean A. Irvine
 */
public class A019298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019298() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 1, 4, 11, 23});
  }
}
