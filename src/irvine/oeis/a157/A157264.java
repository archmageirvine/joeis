package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157264.
 * @author Sean A. Irvine
 */
public class A157264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157264() {
    super(new long[] {1, -3, 3}, new long[] {577, 15841, 51841});
  }
}
