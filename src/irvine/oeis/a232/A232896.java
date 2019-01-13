package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232896.
 * @author Sean A. Irvine
 */
public class A232896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232896() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 3, 5, 8});
  }
}
