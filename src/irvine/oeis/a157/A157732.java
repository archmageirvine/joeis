package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157732.
 * @author Sean A. Irvine
 */
public class A157732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157732() {
    super(new long[] {1, -3, 3}, new long[] {77617, 814087, 2328481});
  }
}
