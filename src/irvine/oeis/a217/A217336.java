package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217336.
 * @author Sean A. Irvine
 */
public class A217336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217336() {
    super(new long[] {3, 0, -27, 0, 33, 0}, new long[] {1, 1, 11, 35, 345, 1129});
  }
}
