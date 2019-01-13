package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037730.
 * @author Sean A. Irvine
 */
public class A037730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037730() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {2, 9, 36, 147, 590});
  }
}
