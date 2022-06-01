package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005686 Number of Twopins positions.
 * @author Sean A. Irvine
 */
public class A005686 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005686() {
    super(new long[] {0, 1, 0, 0, 1, 0}, new long[] {0, 1, 1, 1, 1, 1});
  }
}
