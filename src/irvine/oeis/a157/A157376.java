package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157376 a(n) = 6561*n^2 - 7732*n + 2278.
 * @author Sean A. Irvine
 */
public class A157376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157376() {
    super(new long[] {1, -3, 3}, new long[] {1107, 13058, 38131});
  }
}
