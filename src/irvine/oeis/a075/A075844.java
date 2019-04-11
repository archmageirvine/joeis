package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075844 Numbers n such that <code>11*n^2 + 4</code> is a square.
 * @author Sean A. Irvine
 */
public class A075844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075844() {
    super(new long[] {-1, 20}, new long[] {0, 6});
  }
}
