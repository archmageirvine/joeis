package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047304 Numbers not divisible by 7.
 * @author Sean A. Irvine
 */
public class A047304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047304() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 5, 6, 8});
  }
}
