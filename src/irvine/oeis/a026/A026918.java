package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026918.
 * @author Sean A. Irvine
 */
public class A026918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026918() {
    super(new long[] {1, 1, -3, -2, 3, 1}, new long[] {1, 13, 41, 90, 185, 335});
  }
}
