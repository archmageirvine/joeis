package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189345.
 * @author Sean A. Irvine
 */
public class A189345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189345() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 126, 1820, 12650, 58905, 211876, 635376, 1663740});
  }
}
