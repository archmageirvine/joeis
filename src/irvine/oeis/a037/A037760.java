package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037760.
 * @author Sean A. Irvine
 */
public class A037760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037760() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {3, 18, 109, 656, 3939});
  }
}
