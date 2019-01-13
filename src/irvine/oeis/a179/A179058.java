package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179058.
 * @author Sean A. Irvine
 */
public class A179058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179058() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 6, 96, 600, 2400, 7350});
  }
}
