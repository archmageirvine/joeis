package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157266 a(n) = 1728*n - 408.
 * @author Sean A. Irvine
 */
public class A157266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157266() {
    super(new long[] {-1, 2}, new long[] {1320, 3048});
  }
}
