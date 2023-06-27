package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227144 Numbers that are congruent to {1, 2, 7, 17, 23} modulo 24.
 * @author Sean A. Irvine
 */
public class A227144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227144() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 2, 7, 17, 23, 25});
  }
}
