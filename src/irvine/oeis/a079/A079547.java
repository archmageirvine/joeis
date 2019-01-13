package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079547.
 * @author Sean A. Irvine
 */
public class A079547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079547() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 11, 56, 192, 517});
  }
}
