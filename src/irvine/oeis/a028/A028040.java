package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028040.
 * @author Sean A. Irvine
 */
public class A028040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028040() {
    super(new long[] {-840, 694, -201, 24}, new long[] {1, 24, 375, 4870});
  }
}
