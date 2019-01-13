package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179441.
 * @author Sean A. Irvine
 */
public class A179441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179441() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 21, 121, 432, 1182, 2723});
  }
}
