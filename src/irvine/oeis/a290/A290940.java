package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290940.
 * @author Sean A. Irvine
 */
public class A290940 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290940() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 0, 16, 920, 7800, 36260, 122080, 334656});
  }
}
