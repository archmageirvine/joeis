package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157337.
 * @author Sean A. Irvine
 */
public class A157337 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157337() {
    super(new long[] {1, -3, 3}, new long[] {161, 577, 1249});
  }
}
