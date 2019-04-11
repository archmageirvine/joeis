package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075886 Number of cubes at generation n when building fractal cube with edge ratio of <code>1/2</code>.
 * @author Sean A. Irvine
 */
public class A075886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075886() {
    super(new long[] {-24, 4, 5}, new long[] {1, 6, 30});
  }
}
