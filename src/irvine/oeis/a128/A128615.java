package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128615.
 * @author Sean A. Irvine
 */
public class A128615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128615() {
    super(new long[] {1, 1, 1, -1, -1}, new long[] {0, 1, -1, 0, 2});
  }
}
