package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277792.
 * @author Sean A. Irvine
 */
public class A277792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277792() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 196, 2601, 15376, 60025, 181476});
  }
}
