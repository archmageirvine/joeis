package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036659 Product of n with sum of next n consecutive integers.
 * @author Sean A. Irvine
 */
public class A036659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036659() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 14, 45, 104});
  }
}
