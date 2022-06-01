package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075835 Numbers n such that 13*n^2 + 4 is a square.
 * @author Sean A. Irvine
 */
public class A075835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075835() {
    super(new long[] {-1, 11}, new long[] {0, 3});
  }
}
