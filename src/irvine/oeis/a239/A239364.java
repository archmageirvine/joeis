package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239364 Numbers n such that (n^2-4)/10 is a square.
 * @author Sean A. Irvine
 */
public class A239364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239364() {
    super(1, new long[] {-1, 38}, new long[] {38, 1442});
  }
}
