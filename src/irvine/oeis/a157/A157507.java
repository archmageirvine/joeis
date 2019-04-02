package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157507 a(n) = 81*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A157507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157507() {
    super(new long[] {1, -3, 3}, new long[] {79, 320, 723});
  }
}
