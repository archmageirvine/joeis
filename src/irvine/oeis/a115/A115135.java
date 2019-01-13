package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115135.
 * @author Sean A. Irvine
 */
public class A115135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115135() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 108, 1407, 1851, 2407, 9768, 12340});
  }
}
