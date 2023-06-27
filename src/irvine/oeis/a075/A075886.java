package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075886 Number of cubes at generation n when building fractal cube with edge ratio of 1/2.
 * @author Sean A. Irvine
 */
public class A075886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075886() {
    super(1, new long[] {-24, 4, 5}, new long[] {1, 6, 30});
  }
}
