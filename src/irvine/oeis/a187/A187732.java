package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187732.
 * @author Sean A. Irvine
 */
public class A187732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187732() {
    super(new long[] {-1, 13, -36, 13}, new long[] {0, 1, 13, 133});
  }
}
