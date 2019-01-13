package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079524.
 * @author Sean A. Irvine
 */
public class A079524 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079524() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 4, 6});
  }
}
