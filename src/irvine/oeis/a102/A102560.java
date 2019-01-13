package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102560.
 * @author Sean A. Irvine
 */
public class A102560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102560() {
    super(new long[] {-1, -1, -1}, new long[] {1, 0, 0});
  }
}
