package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075844 Numbers k such that 11*k^2 + 4 is a square.
 * @author Sean A. Irvine
 */
public class A075844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075844() {
    super(new long[] {-1, 20}, new long[] {0, 6});
  }
}
