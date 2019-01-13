package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212714.
 * @author Sean A. Irvine
 */
public class A212714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212714() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {0, 0, 2, 10, 32, 78});
  }
}
