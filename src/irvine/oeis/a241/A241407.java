package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241407 Numbers n such that n^2 == -1 (mod 73).
 * @author Sean A. Irvine
 */
public class A241407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241407() {
    super(1, new long[] {-1, 1, 1}, new long[] {27, 46, 100});
  }
}
