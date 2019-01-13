package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239767.
 * @author Sean A. Irvine
 */
public class A239767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239767() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 6, 11, 22});
  }
}
