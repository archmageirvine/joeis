package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245827.
 * @author Sean A. Irvine
 */
public class A245827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245827() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 59, 216, 526});
  }
}
