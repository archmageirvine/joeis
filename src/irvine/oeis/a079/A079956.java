package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079956.
 * @author Sean A. Irvine
 */
public class A079956 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079956() {
    super(new long[] {1, 0, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 0});
  }
}
