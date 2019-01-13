package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239569.
 * @author Sean A. Irvine
 */
public class A239569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239569() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 21, 151, 615, 1845, 4571});
  }
}
