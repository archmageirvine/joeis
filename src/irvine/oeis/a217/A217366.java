package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217366.
 * @author Sean A. Irvine
 */
public class A217366 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217366() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 7, 2, 27, 5, 55});
  }
}
