package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111258.
 * @author Sean A. Irvine
 */
public class A111258 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111258() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 539, 560, 1803, 4740, 4859, 12020});
  }
}
