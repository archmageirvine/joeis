package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048923 Indices of octagonal numbers which are also 9-gonal.
 * @author Sean A. Irvine
 */
public class A048923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048923() {
    super(new long[] {1, -675, 675}, new long[] {1, 459, 309141});
  }
}
