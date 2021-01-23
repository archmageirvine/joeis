package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111951 Period 8: repeat [0,3,1,2,2,1,3,0].
 * @author Sean A. Irvine
 */
public class A111951 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111951() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1}, new long[] {0, 3, 1, 2, 2, 1, 3});
  }
}
