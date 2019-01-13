package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026810.
 * @author Sean A. Irvine
 */
public class A026810 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026810() {
    super(new long[] {-1, 1, 1, 0, 0, -2, 0, 0, 1, 1}, new long[] {0, 0, 0, 0, 1, 1, 2, 3, 5, 6});
  }
}
