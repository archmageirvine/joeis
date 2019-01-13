package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115851.
 * @author Sean A. Irvine
 */
public class A115851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115851() {
    super(new long[] {-2, 1, 0, 0, 2}, new long[] {0, 0, 1, 1, 1});
  }
}
