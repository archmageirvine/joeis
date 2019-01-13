package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067705.
 * @author Sean A. Irvine
 */
public class A067705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067705() {
    super(new long[] {1, -3, 3}, new long[] {33, 88, 165});
  }
}
