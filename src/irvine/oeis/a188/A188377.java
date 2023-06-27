package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188377 a(n) = n^3 - 4n^2 + 6n - 2.
 * @author Sean A. Irvine
 */
public class A188377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188377() {
    super(3, new long[] {-1, 4, -6, 4}, new long[] {7, 22, 53, 106});
  }
}
