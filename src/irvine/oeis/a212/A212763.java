package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212763.
 * @author Sean A. Irvine
 */
public class A212763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212763() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {0, 2, 3, 32, 40, 162, 189, 512, 576});
  }
}
