package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094864.
 * @author Sean A. Irvine
 */
public class A094864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094864() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 2, 6, 18});
  }
}
