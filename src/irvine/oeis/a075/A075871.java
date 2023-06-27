package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075871 Numbers k such that 13*k^2 + 1 is a square.
 * @author Sean A. Irvine
 */
public class A075871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075871() {
    super(1, new long[] {-1, 1298}, new long[] {0, 180});
  }
}
