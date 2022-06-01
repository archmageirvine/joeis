package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075873 40*n^2 + 9 is a square.
 * @author Sean A. Irvine
 */
public class A075873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075873() {
    super(new long[] {-1, 0, 0, 38, 0, 0}, new long[] {0, 1, 2, 9, 40, 77});
  }
}
