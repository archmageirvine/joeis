package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115266.
 * @author Sean A. Irvine
 */
public class A115266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115266() {
    super(new long[] {1, -2, 0, 0, 3, 0, -3, 0, 0, 2}, new long[] {1, 2, 4, 8, 13, 20, 31, 44, 61, 84});
  }
}
