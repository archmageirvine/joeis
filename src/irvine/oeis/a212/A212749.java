package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212749.
 * @author Sean A. Irvine
 */
public class A212749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212749() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {1, 14, 70, 222, 537, 1116, 2056, 3512});
  }
}
