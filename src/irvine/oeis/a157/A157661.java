package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157661.
 * @author Sean A. Irvine
 */
public class A157661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157661() {
    super(new long[] {1, -3, 3}, new long[] {79201, 318401, 717601});
  }
}
