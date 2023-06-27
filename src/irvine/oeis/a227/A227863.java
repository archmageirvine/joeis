package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227863 Numbers congruent to {1,49} mod 120.
 * @author Sean A. Irvine
 */
public class A227863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227863() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 49, 121});
  }
}
