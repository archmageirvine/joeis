package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226279.
 * @author Sean A. Irvine
 */
public class A226279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226279() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, -1, 0, -1, 2});
  }
}
