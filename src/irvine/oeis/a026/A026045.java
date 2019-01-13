package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026045.
 * @author Sean A. Irvine
 */
public class A026045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026045() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {9, 13, 19, 28, 39, 53, 70, 91});
  }
}
