package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203976.
 * @author Sean A. Irvine
 */
public class A203976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203976() {
    super(new long[] {-1, 0, 3, 0}, new long[] {0, 1, 5, 4});
  }
}
