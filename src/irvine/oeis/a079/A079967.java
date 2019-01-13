package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079967.
 * @author Sean A. Irvine
 */
public class A079967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079967() {
    super(new long[] {1, 0, 1, 1, 1, 1}, new long[] {1, 1, 2, 4, 8, 15});
  }
}
