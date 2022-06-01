package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075848 Numbers k such that 2*k^2 + 9 is a square.
 * @author Sean A. Irvine
 */
public class A075848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075848() {
    super(new long[] {-1, 6}, new long[] {0, 6});
  }
}
