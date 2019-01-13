package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022284.
 * @author Sean A. Irvine
 */
public class A022284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022284() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 53});
  }
}
