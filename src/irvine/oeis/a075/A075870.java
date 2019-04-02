package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075870 Numbers k such that 2*k^2 - 4 is a square.
 * @author Sean A. Irvine
 */
public class A075870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075870() {
    super(new long[] {-1, 6}, new long[] {2, 10});
  }
}
