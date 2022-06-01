package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157110 a(n) = 1681*n^2 - 2606*n + 1010.
 * @author Sean A. Irvine
 */
public class A157110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157110() {
    super(new long[] {1, -3, 3}, new long[] {85, 2522, 8321});
  }
}
