package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117081 36*n^2-810*n+2753.
 * @author Sean A. Irvine
 */
public class A117081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117081() {
    super(new long[] {1, -3, 3}, new long[] {2753, 1979, 1277});
  }
}
