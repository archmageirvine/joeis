package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037758.
 * @author Sean A. Irvine
 */
public class A037758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037758() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {3, 12, 49, 198, 795});
  }
}
