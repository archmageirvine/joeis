package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048923.
 * @author Sean A. Irvine
 */
public class A048923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048923() {
    super(new long[] {1, -675, 675}, new long[] {1, 459, 309141});
  }
}
