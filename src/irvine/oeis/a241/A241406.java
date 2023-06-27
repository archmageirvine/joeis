package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241406 Numbers n such that n^2 == -1 (mod 61).
 * @author Sean A. Irvine
 */
public class A241406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241406() {
    super(1, new long[] {-1, 1, 1}, new long[] {11, 50, 72});
  }
}
