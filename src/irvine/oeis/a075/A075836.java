package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075836 Numbers n such that 10*n^2 + 9 is a square.
 * @author Sean A. Irvine
 */
public class A075836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075836() {
    super(new long[] {-1, 0, 0, 38, 0, 0}, new long[] {0, 2, 4, 18, 80, 154});
  }
}
