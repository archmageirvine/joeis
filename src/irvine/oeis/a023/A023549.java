package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023549.
 * @author Sean A. Irvine
 */
public class A023549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023549() {
    super(new long[] {1, -1, -2, 3}, new long[] {2, 9, 21, 43});
  }
}
