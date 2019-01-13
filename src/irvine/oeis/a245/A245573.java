package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245573.
 * @author Sean A. Irvine
 */
public class A245573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245573() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 1, 2, 2, 1, 2, 2, 3, 3, 1});
  }
}
