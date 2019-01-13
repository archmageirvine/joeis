package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026730.
 * @author Sean A. Irvine
 */
public class A026730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026730() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 2, 1, 3, 2, 3, 1, 5, 4, 7, 3, 8, 5, 7});
  }
}
