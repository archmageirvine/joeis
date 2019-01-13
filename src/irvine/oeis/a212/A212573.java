package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212573.
 * @author Sean A. Irvine
 */
public class A212573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212573() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 2, 10, 36, 92, 202});
  }
}
