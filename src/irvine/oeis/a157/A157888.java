package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157888 a(n) = 81*n^2 + 9.
 * @author Sean A. Irvine
 */
public class A157888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157888() {
    super(1, new long[] {1, -3, 3}, new long[] {90, 333, 738});
  }
}
