package irvine.oeis.a295;

import irvine.oeis.LinearRecurrence;

/**
 * A295200.
 * @author Sean A. Irvine
 */
public class A295200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295200() {
    super(new long[] {-2, 1, 2, -1, 2}, new long[] {1, 3, 8, 14, 25});
  }
}
