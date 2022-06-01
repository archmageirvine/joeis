package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081586 Fourth row of Pascal-(1,3,1) array A081578.
 * @author Sean A. Irvine
 */
public class A081586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081586() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 13, 73, 245});
  }
}
