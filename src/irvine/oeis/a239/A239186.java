package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239186.
 * @author Sean A. Irvine
 */
public class A239186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239186() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {2, 23, 93, 243, 492, 878, 1432, 2165});
  }
}
