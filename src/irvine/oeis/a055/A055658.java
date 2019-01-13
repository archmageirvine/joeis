package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055658.
 * @author Sean A. Irvine
 */
public class A055658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055658() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 1, 35, 286, 1330, 4495});
  }
}
