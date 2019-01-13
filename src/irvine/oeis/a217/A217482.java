package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217482.
 * @author Sean A. Irvine
 */
public class A217482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217482() {
    super(new long[] {1, -2, -4, 10, 5, -20, 0, 20, -5, -10, 4, 2}, new long[] {0, 0, 0, 0, 4, 20, 84, 220, 560, 1140, 2300, 4060});
  }
}
