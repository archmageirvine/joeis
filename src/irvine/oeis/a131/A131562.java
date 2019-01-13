package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131562.
 * @author Sean A. Irvine
 */
public class A131562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131562() {
    super(new long[] {-2, -3, -3}, new long[] {1, -2, 2});
  }
}
