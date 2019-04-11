package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075835 Numbers n such that <code>13*n^2 + 4</code> is a square.
 * @author Sean A. Irvine
 */
public class A075835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075835() {
    super(new long[] {-1, 11}, new long[] {0, 3});
  }
}
